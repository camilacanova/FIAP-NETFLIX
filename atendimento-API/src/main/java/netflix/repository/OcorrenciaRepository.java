package netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import netflix.model.Ocorrencia;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Integer> {
	
	//public List<Ocorrencia> findById(int id);

}
