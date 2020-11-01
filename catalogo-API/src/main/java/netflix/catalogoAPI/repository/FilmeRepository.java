package netflix.catalogoAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import netflix.catalogoAPI.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
	//@Query(value = "select f from Filme f Join fetch f.generos gf where gf.idGenero = :genero_id ")
	Optional<List<Filme>> findFilmeByGenerosId(Long genero_id);
	
    Optional<List<Filme>> findFilmeByGenerosNome(String nomeGenero);
	
	Optional<List<Filme>> findFilmeByIdOrNomeLike(Long idFilme, String nome);
	
	Optional<List<Filme>> findFilmeByCategoriasId(Long genero_id);
	
	Optional<List<Filme>> findFilmeByTagsNome(String nome);
}
