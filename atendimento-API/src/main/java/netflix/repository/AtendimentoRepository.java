package netflix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import netflix.model.Ocorrencia;

public interface AtendimentoRepository extends JpaRepository<Ocorrencia, Integer> {
	
	//public List<Ocorrencia> findById(int id);

}
