package netflix.atendimentoAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.atendimentoAPI.service.TratadorService;
import netflix.model.*;

@RestController
@RequestMapping(value = "/v1/tratador")
public class TratadorController {

	@Autowired
	private TratadorService tratadorService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrarTratador(@RequestBody Tratador tratador) {
		Tratador tratadorCriado = tratadorService.cadastroTratador(tratador);
		if(tratadorCriado != null)
			return "Tratador " + tratadorCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/consultar/{tratadorId}", method = RequestMethod.GET)
	public Optional<Tratador> consultaTratador(@PathVariable("id_tratador") int idTratador) {
		return tratadorService.getTratador(idTratador); 
	}
}
