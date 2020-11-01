package netflix.atendimentoAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import netflix.model.Ocorrencia;
import netflix.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {
	
	@Autowired
	OcorrenciaRepository atendimentoRepository;
	
	public Optional<Ocorrencia> getOcorrencia(int idOcorrencia){
		return atendimentoRepository.findById(idOcorrencia);
	}

	public Ocorrencia createOcorrencia(Ocorrencia ocorrencia) {
		Ocorrencia ocorrenciaCriada = null;
		if(ocorrencia.getDescricao() != null && ocorrencia.getDescricao() != "")
			ocorrenciaCriada = atendimentoRepository.save(ocorrencia);
		return ocorrenciaCriada;
	}	
}
