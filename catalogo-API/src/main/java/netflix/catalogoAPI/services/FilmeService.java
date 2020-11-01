package netflix.catalogoAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import netflix.catalogoAPI.components.CatalogoProducer;
import netflix.catalogoAPI.model.Filme;
import netflix.catalogoAPI.repository.FilmeRepository;

@Service
@EnableBinding(CatalogoProducer.class)
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;
	private CatalogoProducer catalogoProducer;
	
	public Filme cadastrarFilme(Filme filme) {
		Filme filmeCriado = null;
		if(filme.getNome() != null && filme.getNome() != "") {
			filmeCriado = filmeRepository.save(filme);
			catalogoProducer.output()
				.send(MessageBuilder.withPayload(filmeCriado).build());
		}
		return filmeCriado;
	}
	
	public Filme consultarFilme(Long idFilme) {
		Optional<Filme> filme = filmeRepository.findById(idFilme);
		if(filme.isPresent())
			return filme.get();
		return null;
	}
	
	public List<Filme> listarFilmePorGenero(String nomeGenero) {
		Optional<List<Filme>> optionalList = filmeRepository.findFilmeByGenerosNome(nomeGenero);
		
		List<Filme> filmes = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (Filme filme : optionalList.get()) {				
				filmes.add(filme);
			}
		}
		
		return filmes;
	}
	
	public List<Filme> listarFilmePorGenero(Long idGenero) {
		
		Optional<List<Filme>> optionalList = filmeRepository.findFilmeByGenerosId(idGenero);
				
		List<Filme> filmes = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (Filme filme : optionalList.get()) {				
				filmes.add(filme);
			}
		}
		
		return filmes;
	}

	public List<Filme> listarFilmePorCategoria(Long idCategoria) {
		
		Optional<List<Filme>> optionalList = filmeRepository.findFilmeByCategoriasId(idCategoria);
				
		List<Filme> filmes = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (Filme filme : optionalList.get()) {				
				filmes.add(filme);
			}
		}
		
		return filmes;
	}
	
	public List<Filme> listarFilmePorTag(String nomeTag) {
		
		Optional<List<Filme>> optionalList = filmeRepository.findFilmeByTagsNome(nomeTag);
				
		List<Filme> filmes = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (Filme filme : optionalList.get()) {				
				filmes.add(filme);
			}
		}
		
		return filmes;
	}
	
	public List<Filme> listarPorNomeOuId(Long idFilme, String nome) {
		
		Optional<List<Filme>> optionalFilme = filmeRepository.findFilmeByIdOrNomeLike(idFilme, nome);
		
		List<Filme> filmes = new ArrayList<>();	
		if (optionalFilme.isPresent()) {
			for (Filme filme : optionalFilme.get()) {				
				filmes.add(filme);
			}
			return filmes;
		}
		
		return null;		
	}
}
