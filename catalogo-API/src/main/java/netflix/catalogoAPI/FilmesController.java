package netflix.catalogoAPI;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/filmes")
public class FilmesController {

	@RequestMapping(value = "/somar/{valor1}/{valor2}", method = RequestMethod.POST)
	public int somar(@PathVariable("valor1") int v1, @PathVariable("valor2") int v2) {
	return v1 + v2;
	}
	
}
