package netflix.consumousuariosAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.consumousuariosAPI.model.FavoritoUsuario;
import netflix.consumousuariosAPI.repository.FavoritoUsuarioRepository;

@Service
public class FavoritoUsuarioService {
	
	@Autowired
	private FavoritoUsuarioRepository favoritoRepository;
	
	public List<FavoritoUsuario> consultarFavoritos(Long usuarioId){
		Optional<List<FavoritoUsuario>> optionalList = favoritoRepository.findByUsuarioId(usuarioId);
		
		List<FavoritoUsuario> favoritos = new ArrayList<>();		
		if (optionalList.isPresent()) {
			for (FavoritoUsuario favorito : optionalList.get()) {				
				favoritos.add(favorito);
			}
		}
		
		return favoritos;
	}
	
	public FavoritoUsuario cadastrarFavorito(FavoritoUsuario favoritoUsuario) {
		FavoritoUsuario favoritoCriado = null;
		if(favoritoUsuario.getUsuario().getId() != null && 
			favoritoUsuario.getUsuario().getId() != null)
			favoritoCriado = favoritoRepository.save(favoritoUsuario);
		return favoritoCriado;
	}
}
