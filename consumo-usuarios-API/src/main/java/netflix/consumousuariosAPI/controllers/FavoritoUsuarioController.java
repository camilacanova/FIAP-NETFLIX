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

import netflix.consumousuariosAPI.model.FavoritoUsuario;
import netflix.consumousuariosAPI.services.FavoritoUsuarioService;

@RestController
@RequestMapping(value = "v1/favoritos")
public class FavoritoUsuarioController {
	@Autowired
	private FavoritoUsuarioService favoritoService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroFavoritos(@RequestBody FavoritoUsuario favorito) {
		FavoritoUsuario favoritoCriado = favoritoService.cadastrarFavorito(favorito);
		if(favoritoCriado != null)
			return "Favorito " + favoritoCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/{id_usuario}", method = RequestMethod.GET)
	public ResponseEntity<List<FavoritoUsuario>> ListarFavoritos(@PathVariable("id_usuario") long idUsuario){
		List<FavoritoUsuario> lista = favoritoService.consultarFavoritos(idUsuario);
		return new ResponseEntity(lista, HttpStatus.OK); 
	}
}
