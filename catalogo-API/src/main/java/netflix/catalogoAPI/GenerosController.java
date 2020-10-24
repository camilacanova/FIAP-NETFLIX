package netflix.catalogoAPI;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.model.Genero;

@RestController
@RequestMapping(value = "v1/generos")
public class GenerosController {
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroGeneros(@RequestBody Genero genero) {
	
		return "Genero cadastrado!";
	}
	
}
