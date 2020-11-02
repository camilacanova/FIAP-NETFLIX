package netflix.consumousuariosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.consumousuariosAPI.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
