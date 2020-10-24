package netflix.model;

import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long Id;
	public boolean Ativo;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public boolean isAtivo() {
		return Ativo;
	}

	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String Nome;
}
