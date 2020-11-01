package netflix.consumousuariosAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.model.HistoricoUsuario;
import netflix.consumousuariosAPI.repository.HistoricoUsuarioRepository;

@Service
public class HistoricoUsuarioService {

	@Autowired
	private HistoricoUsuarioRepository historicoRepository;
	
	public List<HistoricoUsuario> consultarHistorico(Long usuarioId){
		Optional<List<HistoricoUsuario>> optionalList = historicoRepository.findByUsuarioId(usuarioId);
		
		List<HistoricoUsuario> historicos = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (HistoricoUsuario historico : optionalList.get()) {				
				historicos.add(historico);
			}
		}
		
		return historicos;
	}
	
	public HistoricoUsuario cadastrarHistorico(HistoricoUsuario HistoricoUsuario) {
		HistoricoUsuario historicoCriado = null;
		if(HistoricoUsuario.getUsuario().getId() != null && 
			HistoricoUsuario.getFilme().getId() != null)
			historicoCriado = historicoRepository.save(HistoricoUsuario);
		return historicoCriado;
	}
}
