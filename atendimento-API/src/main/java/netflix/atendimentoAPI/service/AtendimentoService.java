package netflix.atendimentoAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.model.Ocorrencia;
import netflix.repository.AtendimentoRepository;

@Service
public class AtendimentoService {
	
	@Autowired
	AtendimentoRepository atendimentoRepository;
	
	public Ocorrencia getOcorrencia(int idOcorrencia) {
		
		return new Ocorrencia();
		//return atendimentoRepository.findById(idOcorrencia);
	}

	public Ocorrencia createOcorrencia(Ocorrencia ocorrencia) {
		return new Ocorrencia();
	}
	
	
}
