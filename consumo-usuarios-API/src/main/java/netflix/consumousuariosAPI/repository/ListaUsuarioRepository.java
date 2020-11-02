package netflix.consumousuariosAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.consumousuariosAPI.model.ListaUsuario;

public interface ListaUsuarioRepository extends JpaRepository<ListaUsuario, Integer>{

	Optional<List<ListaUsuario>> findByUsuarioId(Long usuario_id);
}
