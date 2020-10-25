package netflix.catalogoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.catalogoAPI.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer>{

}
