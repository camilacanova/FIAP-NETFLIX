package netflix.consumousuariosAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.consumousuariosAPI.model.Usuario;
import netflix.consumousuariosAPI.services.UsuarioService;

@RestController
@RequestMapping(value = "v1/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroListas(@RequestBody Usuario usuario) {
		Usuario usuarioCriado = usuarioService.cadastrarUsuario(usuario);
		if(usuarioCriado != null)
			return "Lista " + usuarioCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/{id_usuario}", method = RequestMethod.GET)
	public Usuario consultaUsuario(@PathVariable("id_usuario") Long usuarioId) {
		return usuarioService.consultarUsuario(usuarioId);
	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> ListarUsuarios(){
		List<Usuario> usuario = usuarioService.consultarUsuarios();
		return new ResponseEntity(usuario, HttpStatus.OK); 
	}
}
