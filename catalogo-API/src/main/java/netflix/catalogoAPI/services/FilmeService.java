package netflix.catalogoAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import netflix.catalogoAPI.model.Filme;
import netflix.catalogoAPI.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;
	
	public Filme cadastrarFilme(Filme filme) {
		Filme filmeCriado = null;
		if(filme.getNome() != null && filme.getNome() != "")
			filmeCriado = filmeRepository.save(filme);
		return filmeCriado;
	}
	
	public Optional<Filme> consultarFilme(int idFilme) {
		return filmeRepository.findById(idFilme);		
	}
	
	public List<Filme> listarFilmePorGenero(String nomeGenero) {
		
		//Optional<List<Filme>> optionalList = filmeRepository.findFilmeByGeneroNome(nomeGenero);
		
		List<Filme> filmes = new ArrayList<>();		
//		if (optionalList.isPresent()) {
//			for (Filme filme : optionalList.get()) {				
//				filmes.add(filme);
//			}
//		}
		
		return filmes;
	}
	
	public List<Filme> listarFilmePorGenero(Long idGenero) {
		
//		Optional<List<Filme>> optionalList = filmeRepository.findFilmeByGenero(idGenero);
				
		List<Filme> filmes = new ArrayList<>();		
//		if (optionalList.isPresent()) {
//			for (Filme filme : optionalList.get()) {				
//				filmes.add(filme);
//			}
//		}
		
		return filmes;
	}

	public List<Filme> listarFilmePorCategoria(Long idCategoria) {
		
//		Optional<List<Filme>> optionalList = filmeRepository.findByIdGenero(idCategoria);
				
		List<Filme> filmes = new ArrayList<>();		
//		if (optionalList.isPresent()) {
//			for (Filme filme : optionalList.get()) {				
//				filmes.add(filme);
//			}
//		}
		
		return filmes;
	}
	
	public List<Filme> listarFilmePorTag(Long idTag) {
		
		//Optional<List<Filme>> optionalList = filmeRepository.findByIdGenero(idCategoria);
				
		List<Filme> filmes = new ArrayList<>();		
//		if (optionalList.isPresent()) {
//			for (Filme filme : optionalList.get()) {				
//				filmes.add(filme);
//			}
//		}
		
		return filmes;
	}
	
	public List<Filme> listarPorNomeOuId(Long idFilme, String nome) {
		
		//Optional<List<Filme>> optionalFilme = filmeRepository.findFilmeByIdOrNomeLike(idFilme, nome);
		
		List<Filme> filmes = new ArrayList<>();	
//		if (optionalFilme.isPresent()) {
//			for (Filme filme : optionalFilme.get()) {				
//				filmes.add(filme);
//			}
//			return filmes;
//		}
		
		return null;		
	}
}
