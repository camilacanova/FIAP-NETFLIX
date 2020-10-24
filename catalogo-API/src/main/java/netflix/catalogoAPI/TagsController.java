package netflix.catalogoAPI;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.model.Tag;

@RestController
@RequestMapping(value = "v1/tags")
public class TagsController {
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroTags(@RequestBody Tag tag) {
	
		return "Tag cadastrada!";
	}
	
}
