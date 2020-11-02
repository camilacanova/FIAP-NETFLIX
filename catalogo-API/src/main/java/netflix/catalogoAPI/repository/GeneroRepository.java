package netflix.catalogoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.catalogoAPI.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}
