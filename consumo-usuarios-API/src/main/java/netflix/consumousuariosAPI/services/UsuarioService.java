package netflix.consumousuariosAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.model.Usuario;
import netflix.consumousuariosAPI.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository historicoRepository;
	
	public List<Usuario> consultarUsuarios(){
		return historicoRepository.findAll();
	}
	
	public Usuario cadastrarUsuario(Usuario Usuario) {
		Usuario historicoCriado = null;
		if(Usuario.getNome() != null && 
			Usuario.getNome() != "")
			historicoCriado = historicoRepository.save(Usuario);
		return historicoCriado;
	}
}
