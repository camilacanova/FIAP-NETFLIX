package netflix.consumousuariosAPI.services;

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

import netflix.consumousuariosAPI.cache.CacheManagement;
import netflix.consumousuariosAPI.model.Filme;

@Service
@EnableBinding(Sink.class)
public abstract class ConsumerService {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@StreamListener(target = Sink.INPUT)
	public void consumerProductEvent(@Payload Filme filme) {
		System.out.println("Filme recebido {} " + filme.getId() + 
				" Nome: " + filme.getNome());
		CacheManagement.put(filme);
	}
	
	protected Filme getFilmeFromService(Filme filme) {
		List<ServiceInstance> instances = discoveryClient.getInstances("catalogo-API");;
		Filme filmeCache = null;
		if (instances.size() == 0) {
			throw new RuntimeException();
		} else {
			RestTemplate restTemplate = new RestTemplate();
			
			String uri = String.format("%s/v1/filmes/%s",
					instances.get(0).getUri().toString(), filme.getId());
			
			ResponseEntity<Filme> restExchange = restTemplate.exchange(uri,
					HttpMethod.GET, null, Filme.class,filme.getId());
			
			filmeCache = restExchange.getBody();
			
			CacheManagement.put(filmeCache);
		}
		return filmeCache;
	}
}
