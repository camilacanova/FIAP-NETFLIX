package netflix.consumousuariosAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.consumousuariosAPI.model.FavoritoUsuario;

public interface FavoritoUsuarioRepository extends JpaRepository<FavoritoUsuario, Integer>{

	Optional<List<FavoritoUsuario>> findByUsuarioId(Long usuario_id);
}
