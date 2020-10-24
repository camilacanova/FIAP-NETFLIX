package netflix.catalogoAPI;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.model.Categoria;

@RestController
@RequestMapping(value = "v1/categorias")
public class CategoriasController {
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroCategorias(@RequestBody Categoria categoria) {
	
		return "Categoria cadastrada!";
	}
}
