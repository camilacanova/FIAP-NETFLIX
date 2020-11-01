package netflix.consumousuariosAPI.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netflix.consumousuariosAPI.model.HistoricoUsuario;
import netflix.consumousuariosAPI.services.HistoricoUsuarioService;

@RestController
@RequestMapping(value = "v1/historico")
public class HistoricoUsuarioController {

	@Autowired
	private HistoricoUsuarioService historicoService;
	
//	//Cadastro de historicos
//	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
//	public String cadastroHistoricoUsuarios(@RequestBody HistoricoUsuario historico) {
//		HistoricoUsuario historicoCriado = historicoService.visualizarFilme(historico);
//		if(historicoCriado != null)
//			return "HistoricoUsuario " + historicoCriado.getId() + " cadastrado";
//		return "Erro ao cadastrar";
//	}
//	
//	//Consulta detalhe de um historico	
//	@RequestMapping(value = "/{id_historico}", method = RequestMethod.GET)
//	public Optional<HistoricoUsuario> consultarLista(@PathVariable("id_usuario") int idUsuario) {
//		return historicoService.consultarLista(idUsuario);
//	}
}
