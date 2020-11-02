package netflix.catalogoAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.catalogoAPI.model.Categoria;
import netflix.catalogoAPI.services.CatalogoService;

@RestController
@RequestMapping(value = "v1/categorias")
public class CategoriasController {
	
	@Autowired
	private CatalogoService CatalogoService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroCategorias(@RequestBody Categoria categoria) {
		
		return "Categoria cadastrada!";
	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> ListarCategorias(){
		List<Categoria> lista = CatalogoService.ConsultarCategoria();
		return new ResponseEntity<List<Categoria>>(lista, HttpStatus.OK); 
	}
}
