package netflix.catalogoAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.catalogoAPI.model.Genero;
import netflix.catalogoAPI.repository.GeneroRepository;

@Service
public class GeneroService {

	@Autowired
	private GeneroRepository generoRepository;
	
	public List<Genero> consultarGeneros(){
		return generoRepository.findAll();
	}
	
	public Genero cadastrarGenero(Genero Genero) {
		Genero generoCriado = null;
		if(Genero.getNome() != null && Genero.getNome() != "")
			generoCriado = generoRepository.save(Genero);
		return generoCriado;
	}
}
