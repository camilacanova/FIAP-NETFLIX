package netflix.catalogoAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.catalogoAPI.model.Tag;
import netflix.catalogoAPI.repository.TagRepository;

@Service
public class TagService {

	@Autowired
	private TagRepository tagRepository;
	
	public List<Tag> consultarTags(){
		return tagRepository.findAll();
	}
	
	public Tag cadastrarTag(Tag Tag) {
		Tag tagCriado = null;
		if(Tag.getNome() != null && Tag.getNome() != "")
			tagCriado = tagRepository.save(Tag);
		return tagCriado;
	}
}
