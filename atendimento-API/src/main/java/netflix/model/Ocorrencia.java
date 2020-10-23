package netflix.model;

import java.util.List;

import netflix.catalogoAPI.Conteudo;
import netflix.catalogoAPI.Entidade;

public class Ocorrencia extends Pessoa {
	public Tratador usuarioTratador;
	public Tratador getUsuarioTratador() {
		return usuarioTratador;
	}

	public void setNome(Tratador tratador) {
		usuarioTratador = tratador;
	}

	public Usuario usuario;
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario user) {
		usuario = user;
	}

	public TipoOcorrencia tipoOcorrencia;
	public Usuario getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(TipoOcorrencia tipoOcor) {
		tipoOcorrencia = tipoOcor;
	}
	
	public String descricao;
	public String getTipoOcorrencia() {
		return descricao;
	}

	public void setDescricao(String desc) {
		descricao = desc;
	}

	public String status;
	public String getStatus() {
		return status;
	}

	public void setStatus(String sta) {
		status = sta;
	}
}