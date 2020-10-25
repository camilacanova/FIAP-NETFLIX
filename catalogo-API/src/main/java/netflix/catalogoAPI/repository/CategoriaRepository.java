package netflix.catalogoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.catalogoAPI.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
