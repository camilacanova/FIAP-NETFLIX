package netflix.catalogoAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import netflix.catalogoAPI.model.*;
import netflix.catalogoAPI.repository.CategoriaRepository;

@Service
public class CatalogoService {

	@Autowired
	private CategoriaRepository catRepository;
	
	public List<Categoria> ConsultarCategoria(){
		return catRepository.findAll();
	}
}
