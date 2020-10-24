package netflix.atendimentoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.atendimentoAPI.service.AtendimentoService;
import netflix.model.*;

@RestController
@RequestMapping(value = "/v1/orderservice")
public class AtendimentoController {

	@Autowired
	private AtendimentoService atendimentoService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createOrder(@RequestBody Ocorrencia ocorrencia) {
		Ocorrencia createOcorrencia = null;
		createOcorrencia = atendimentoService.createOcorrencia(ocorrencia);
		return "Ocorrência Id = " + createOcorrencia.getId();
	}
	
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
	public ResponseEntity<?> getProduct(@PathVariable(name = "idOcorrencia") int idOcorrencia) {
		Ocorrencia ocorrencia = null;
		ocorrencia = atendimentoService.getOcorrencia(idOcorrencia);
		return ResponseEntity.ok(ocorrencia);
	}

}
