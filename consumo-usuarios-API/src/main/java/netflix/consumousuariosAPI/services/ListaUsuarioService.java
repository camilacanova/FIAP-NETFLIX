package netflix.consumousuariosAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.cache.CacheManagement;
import netflix.consumousuariosAPI.model.Filme;
import netflix.consumousuariosAPI.model.ListaUsuario;
import netflix.consumousuariosAPI.repository.ListaUsuarioRepository;

@Service
public class ListaUsuarioService extends ConsumerService {
	@Autowired
	private ListaUsuarioRepository listaRepository;
	
	public List<ListaUsuario> consultarLista(Long usuarioId){
		Optional<List<ListaUsuario>> optionalList = listaRepository.findByUsuarioId(usuarioId);
		
		List<ListaUsuario> listas = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (ListaUsuario lista : optionalList.get()) {
				Filme filme = CacheManagement.get(lista.getIdFilme());
				if(filme == null) {
					filme = new Filme(lista.getIdFilme());
					filme = getFilmeFromService(filme);
				}
				lista.setFilme(filme);
				listas.add(lista);
			}
		}
		return listas;
	}
	
	public ListaUsuario cadastrarLista(ListaUsuario ListaUsuario) {
		ListaUsuario listaCriado = null;
		if(ListaUsuario.getUsuario().getId() != null && 
			ListaUsuario.getFilme().getId() != null)
			listaCriado = listaRepository.save(ListaUsuario);
		return listaCriado;
	}
}
