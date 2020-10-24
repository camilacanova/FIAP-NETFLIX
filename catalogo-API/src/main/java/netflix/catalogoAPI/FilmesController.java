package netflix.catalogoAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.model.Filme;

@RestController
@RequestMapping(value = "v1/filmes")
public class FilmesController {
	
	//Cadastro de filmes
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroFilmes(@RequestBody Filme filme) {
	
		return "Filme cadastrado!";
	}
	
	//Consulta detalhe de um filme	
	@RequestMapping(value = "/{codigo_filme}", method = RequestMethod.GET)
	public Filme consultaFilme(@PathVariable("codigo_filme") int codigoFilme) {
		Filme filme = new Filme();
		return filme;
	}
	
	//Consulta de filmes por genero	
	@RequestMapping(value = "/genero/{nome_genero}", method = RequestMethod.GET)
	public List<Filme> consultaGenero(@PathVariable("nome_genero") String nomeGenero) {
		List<Filme> filmes = new ArrayList<Filme>();
		return filmes;
	}
	
	//Consulta de filmes por palavras chaves	
	@RequestMapping(value = "/tags/{nome_tag}", method = RequestMethod.GET)
	public List<Filme> consultaTag(@PathVariable("nome_tag") String nomeTag) {
		List<Filme> filmes = new ArrayList<Filme>();
		return filmes;
	}
	
	//Possibilidade de exibir os filmes mais vistos por categorias	
	@RequestMapping(value = "/mais_vistos/{nome_categoria}", method = RequestMethod.GET)
	public List<Filme> maisVistosCategoria(@PathVariable("nome_categoria") String nomeCategoria) {
		List<Filme> filmes = new ArrayList<Filme>();
		return filmes;
	}
}
