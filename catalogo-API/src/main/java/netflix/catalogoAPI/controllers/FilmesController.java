package netflix.catalogoAPI.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.catalogoAPI.model.Filme;
import netflix.catalogoAPI.services.FilmeService;

@RestController
@RequestMapping(value = "v1/filmes")
public class FilmesController {
	
	@Autowired
	private FilmeService filmeService;
	
	//Cadastro de filmes
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroFilmes(@RequestBody Filme filme) {
		Filme filmeCriado = filmeService.cadastrarFilme(filme);
		if(filmeCriado != null)
			return "Filme " + filmeCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	//Consulta detalhe de um filme	
	@RequestMapping(value = "/{id_filme}", method = RequestMethod.GET)
	public Filme consultaFilme(@PathVariable("id_filme") Long idFilme) {
		return filmeService.consultarFilme(idFilme);
	}
	
	//Consulta de filmes por genero	
	@RequestMapping(value = "/genero/{nome_genero}", method = RequestMethod.GET)
	public List<Filme> consultaGenero(@PathVariable("nome_genero") String nomeGenero) {
		return filmeService.listarFilmePorGenero(nomeGenero);
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
