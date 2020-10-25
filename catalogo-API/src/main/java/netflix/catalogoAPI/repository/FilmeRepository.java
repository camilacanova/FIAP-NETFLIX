package netflix.catalogoAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.catalogoAPI.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
	
	//@Query(value = "select f from Filme f Join fetch f.genero gf where gf.idGenero = :idGenero")
	//Optional<List<Filme>> findFilmeByGenero(Long idGenero);
	
	//Optional<List<Filme>> findFilmeByGeneroNome(String nomeGenero);
	
	//Optional<List<Filme>> findFilmeByIdOrNomeLike(Long idFilme, String nome);
}
