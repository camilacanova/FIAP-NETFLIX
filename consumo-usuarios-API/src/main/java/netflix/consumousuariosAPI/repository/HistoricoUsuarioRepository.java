package netflix.consumousuariosAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.consumousuariosAPI.model.HistoricoUsuario;

public interface HistoricoUsuarioRepository extends JpaRepository<HistoricoUsuario, Integer>{

	Optional<List<HistoricoUsuario>> findByUsuarioId(Long usuario_id);
}
