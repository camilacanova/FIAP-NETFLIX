package netflix.atendimentoAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.atendimentoAPI.service.OcorrenciaService;
import netflix.model.*;

@RestController
@RequestMapping(value = "/v1/ocorrencia")
public class OcorrenciaController {

	@Autowired
	private OcorrenciaService ocorrenciaService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrarOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		Ocorrencia ocorrenciaCriada = ocorrenciaService.createOcorrencia(ocorrencia);
		if(ocorrenciaCriada != null)
			return "Ocorrência " + ocorrenciaCriada.getId() + " cadastrada";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/consultar/{ocorrenciaId}", method = RequestMethod.GET)
	public Optional<Ocorrencia> consultaOcorrencia(@PathVariable("id_ocorrencia") int idOcorrencia) {
		return ocorrenciaService.getOcorrencia(idOcorrencia); 
	}
}
