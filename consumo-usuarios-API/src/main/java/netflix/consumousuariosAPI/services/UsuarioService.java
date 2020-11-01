package netflix.consumousuariosAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.component.UsuarioProducer;
import netflix.consumousuariosAPI.model.Usuario;
import netflix.consumousuariosAPI.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioProducer usuarioProducer;
	
	public List<Usuario> consultarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario consultarUsuario(Long usuarioId){
		Optional<Usuario> optUsuario = usuarioRepository.findById(usuarioId);
		if(optUsuario.isPresent())
			return optUsuario.get();
		
		return null;
	}
	
	public Usuario cadastrarUsuario(Usuario Usuario) {
		Usuario usuarioCriado = null;
		if(Usuario.getNome() != null && 
			Usuario.getNome() != "") {
			usuarioCriado = usuarioRepository.save(Usuario);
			usuarioProducer.output()
			.send(MessageBuilder.withPayload(usuarioCriado).build());
		}
		return usuarioCriado;
	}
}
