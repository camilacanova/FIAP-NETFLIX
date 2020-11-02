package netflix.consumousuariosAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.consumousuariosAPI.model.HistoricoUsuario;
import netflix.consumousuariosAPI.model.HistoricoUsuario;
import netflix.consumousuariosAPI.services.HistoricoUsuarioService;

@RestController
@RequestMapping(value = "v1/historico")
public class HistoricoUsuarioController {

	@Autowired
	private HistoricoUsuarioService historicoService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastroHistoricos(@RequestBody HistoricoUsuario historico) {
		HistoricoUsuario historicoCriado = historicoService.cadastrarHistorico(historico);
		if(historicoCriado != null)
			return "Historico " + historicoCriado.getId() + " cadastrado";
		return "Erro ao cadastrar";
	}
	
	@RequestMapping(value = "/{id_usuario}", method = RequestMethod.GET)
	public ResponseEntity<List<HistoricoUsuario>> ListarHistoricos(@PathVariable("id_usuario") long idUsuario){
		List<HistoricoUsuario> lista = historicoService.consultarHistorico(idUsuario);
		return new ResponseEntity(lista, HttpStatus.OK); 
	}
	
//	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
//	public String atualizarHistorico(@RequestBody HistoricoUsuario historico) {
//		HistoricoUsuario historicoCriado = historicoService.Historico(historico);
//		if(historicoCriado != null)
//			return "Historico " + historicoCriado.getId() + " cadastrado";
//		return "Erro ao cadastrar";
//	}
}
