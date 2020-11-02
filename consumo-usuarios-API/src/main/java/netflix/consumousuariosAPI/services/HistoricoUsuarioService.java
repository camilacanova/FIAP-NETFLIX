package netflix.consumousuariosAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.cache.CacheManagement;
import netflix.consumousuariosAPI.model.Filme;
import netflix.consumousuariosAPI.model.HistoricoUsuario;
import netflix.consumousuariosAPI.model.ListaUsuario;
import netflix.consumousuariosAPI.repository.HistoricoUsuarioRepository;

@Service
public class HistoricoUsuarioService extends ConsumerService{

	@Autowired
	private HistoricoUsuarioRepository historicoRepository;
	
	public List<HistoricoUsuario> consultarHistorico(Long usuarioId){
		Optional<List<HistoricoUsuario>> optionalList = historicoRepository.findByUsuarioId(usuarioId);
		
		List<HistoricoUsuario> historicos = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (HistoricoUsuario historico : optionalList.get()) {
				Filme filme = CacheManagement.get(historico.getIdFilme());
				if(filme == null) {
					filme = new Filme(historico.getIdFilme());
					filme = getFilmeFromService(filme);
				}
				historico.setFilme(filme);
				
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
