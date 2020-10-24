package netflix.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import netflix.model.Filme;


public interface FilmeRepository extends JpaRepository<Filme, Integer> {
	

}
