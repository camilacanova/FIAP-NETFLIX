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

import netflix.catalogoAPI.model.Tag;
import netflix.catalogoAPI.services.TagService;

@RestController
@RequestMapping(value = "v1/tags")
public class TagsController {
	
	@Autowired
	private TagService tagService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroTags(@RequestBody Tag tag) {
		Tag tagCriado = tagService.cadastrarTag(tag);
		if(tagCriado != null)
			return "Tag " + tagCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
		
	//Consulta detalhe de um Tag	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public ResponseEntity<List<Tag>> consultaTag(@PathVariable("idTag") int idTag) {
		List<Tag> lista = tagService.consultarTags();
		return new ResponseEntity<List<Tag>>(lista, HttpStatus.OK); 
	}
}
