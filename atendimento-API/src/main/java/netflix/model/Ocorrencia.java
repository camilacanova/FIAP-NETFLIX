package netflix.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ocorrencia{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int Id;
	
	public boolean Ativo;
	
	@OneToOne
	public Usuario usuario;
	
	@OneToOne
	public TipoOcorrencia tipoOcorrencia;
	
	public String descricao;
	public String status;
	
	@OneToOne
	public Tratador usuarioTratador;
	
	public Tratador getUsuarioTratador() {
		return usuarioTratador;
	}
	public void setUsuarioTratador(Tratador usuarioTratador) {
		this.usuarioTratador = usuarioTratador;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public TipoOcorrencia getTipoOcorrencia() {
		return tipoOcorrencia;
	}
	public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public boolean isAtivo() {
		return Ativo;
	}
	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

}