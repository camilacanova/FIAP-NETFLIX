package netflix.atendimentoAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.atendimentoAPI.service.TipoOcorrenciaService;
import netflix.model.*;

@RestController
@RequestMapping(value = "/v1/tipo_ocorrencia")
public class TipoOcorrenciaController {

	@Autowired
	private TipoOcorrenciaService tipoOcorrenciaService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrarTipoOcorrencia(@RequestBody TipoOcorrencia tipoOcorrencia) {
		TipoOcorrencia tipoOcorrenciaCriado = tipoOcorrenciaService.cadastroTipoOcorrencia(tipoOcorrencia);
		if(tipoOcorrenciaCriado != null)
			return "Tipo ocorrência " + tipoOcorrenciaCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/consultar/{tipoOcorrenciaId}", method = RequestMethod.GET)
	public Optional<TipoOcorrencia> consultaTipoOcorrenciaId(@PathVariable("tipoOcorrenciaId") int tipoOcorrenciaId) {
		return tipoOcorrenciaService.getTipoOcorrenciaId(tipoOcorrenciaId); 
	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<TipoOcorrencia> consultaTipoOcorrencias() {
		return tipoOcorrenciaService.getTipoOcorrencias(); 
	}
}
