package netflix.atendimentoAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import netflix.atendimentoAPI.cache.CacheManagement;
import netflix.atendimentoAPI.model.Usuario;

@Service
@EnableBinding(Sink.class)
public abstract class ConsumerService {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@StreamListener(target = Sink.INPUT)
	public void consumerProductEvent(@Payload Usuario usuario) {
		System.out.println("Usuario recebido {} " + usuario.getId() + 
				" Nome: " + usuario.getNome());
		CacheManagement.put(usuario);
	}
	
	protected Usuario getUsuarioFromService(Usuario usuario) {
		List<ServiceInstance> instances = discoveryClient.getInstances("catalogo-API");;
		Usuario usuarioCache = null;
		if (instances.size() == 0) {
			throw new RuntimeException();
		} else {
			RestTemplate restTemplate = new RestTemplate();
			
			String uri = String.format("%s/v1/usuarios/%s",
					instances.get(0).getUri().toString(), usuario.getId());
			
			ResponseEntity<Usuario> restExchange = restTemplate.exchange(uri,
					HttpMethod.GET, null, Usuario.class,usuario.getId());
			
			usuarioCache = restExchange.getBody();
			
			CacheManagement.put(usuarioCache);
		}
		return usuarioCache;
	}
}
