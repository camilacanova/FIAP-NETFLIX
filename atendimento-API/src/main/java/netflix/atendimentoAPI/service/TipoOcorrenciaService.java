package netflix.atendimentoAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.atendimentoAPI.model.TipoOcorrencia;
import netflix.atendimentoAPI.repository.TipoOcorrenciaRepository;

@Service
public class TipoOcorrenciaService {
	
	@Autowired
	TipoOcorrenciaRepository tipoOcorrenciaRepository;
	
	public Optional<TipoOcorrencia> getTipoOcorrenciaId(int idTipoOcorrencia){
		return tipoOcorrenciaRepository.findById(idTipoOcorrencia);
	}
	
	public List<TipoOcorrencia> getTipoOcorrencias(){
		return tipoOcorrenciaRepository.findAll();
	}

	public TipoOcorrencia cadastroTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		TipoOcorrencia tipoOcorrenciaCriada = null;
		if(tipoOcorrencia.getNome() != null && tipoOcorrencia.getNome() != "")
			tipoOcorrenciaCriada = tipoOcorrenciaRepository.save(tipoOcorrencia);
		return tipoOcorrenciaCriada;
	}	
}
