package netflix.atendimentoAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import netflix.atendimentoAPI.model.Tratador;
import netflix.atendimentoAPI.repository.TratadorRepository;

@Service
public class TratadorService {
	
	@Autowired
	TratadorRepository tratadorRepository;
	
	public Optional<Tratador> getTratador(int idTratador){
		return tratadorRepository.findById(idTratador);
	}

	public Tratador cadastroTratador(Tratador tratador) {
		Tratador tratadorCriado = null;
		if(tratador.getNome() != null && tratador.getNome() != "")
			tratadorCriado = tratadorRepository.save(tratador);
		return tratadorCriado;
	}	
}
