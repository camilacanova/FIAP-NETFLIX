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

import netflix.consumousuariosAPI.model.ListaUsuario;
import netflix.consumousuariosAPI.model.ListaUsuario;
import netflix.consumousuariosAPI.services.ListaUsuarioService;

@RestController
@RequestMapping(value = "v1/lista")
public class ListaUsuarioController {

	@Autowired
	private ListaUsuarioService listaService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroListas(@RequestBody ListaUsuario lista) {
		ListaUsuario listaCriado = listaService.cadastrarLista(lista);
		if(listaCriado != null)
			return "Lista " + listaCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/{id_usuario}", method = RequestMethod.GET)
	public ResponseEntity<List<ListaUsuario>> ListarListas(@PathVariable("id_usuario") long idUsuario){
		List<ListaUsuario> lista = listaService.consultarLista(idUsuario);
		return new ResponseEntity(lista, HttpStatus.OK); 
	}
}
