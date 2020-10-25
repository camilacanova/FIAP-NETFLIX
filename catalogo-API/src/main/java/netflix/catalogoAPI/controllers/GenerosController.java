package netflix.catalogoAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.catalogoAPI.model.Genero;
import netflix.catalogoAPI.services.GeneroService;

@RestController
@RequestMapping(value = "v1/generos")
public class GenerosController {
	
	@Autowired
	private GeneroService generoService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroGeneros(@RequestBody Genero genero) {
		Genero generoCriado = generoService.cadastrarGenero(genero);
		if(generoCriado != null)
			return "Genero " + generoCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
		
	//Consulta detalhe de um Genero	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public ResponseEntity<List<Genero>> consultaGenero(@PathVariable("idGenero") int idGenero) {
		List<Genero> lista = generoService.consultarGeneros();
		return new ResponseEntity(lista, HttpStatus.OK); 
	}
	
}
