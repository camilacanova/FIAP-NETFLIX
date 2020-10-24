package netflix.atendimentoAPI.service;

import org.springframework.stereotype.Service;

import netflix.model.Ocorrencia;

@Service
public class AtendimentoService {

	public Ocorrencia createOcorrencia(Ocorrencia ocorrencia) {
		return new Ocorrencia();
	}
	
	public Ocorrencia getOcorrencia(int idOcorrencia) {
		return new Ocorrencia();
	}
}
