package netflix.atendimentoAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.atendimentoAPI.cache.CacheManagement;
import netflix.atendimentoAPI.model.Ocorrencia;
import netflix.atendimentoAPI.model.Usuario;
import netflix.atendimentoAPI.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService extends ConsumerService {
	
	@Autowired
	private OcorrenciaRepository ocorrenciaRepository;
	
	public Ocorrencia getOcorrencia(int idOcorrencia){
		Optional<Ocorrencia> ocorrenciaOpt = ocorrenciaRepository.findById(idOcorrencia);
		Ocorrencia ocorrencia = null;
		if(ocorrenciaOpt.isPresent()) {
			ocorrencia = ocorrenciaOpt.get();
			Usuario usuario = CacheManagement.get(ocorrencia.getIdUsuario());
			if(usuario == null) {
				usuario = new Usuario(ocorrencia.getIdUsuario());
				usuario = getUsuarioFromService(usuario);
			}
			ocorrencia.setUsuario(usuario);
		}
		
		return ocorrencia;
	}

	public Ocorrencia createOcorrencia(Ocorrencia ocorrencia) {
		Ocorrencia ocorrenciaCriada = null;
		if(ocorrencia.getDescricao() != null && ocorrencia.getDescricao() != "")
			ocorrenciaCriada = ocorrenciaRepository.save(ocorrencia);
		return ocorrenciaCriada;
	}	
}
