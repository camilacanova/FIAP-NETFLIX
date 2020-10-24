package netflix.model;

import javax.persistence.Entity;

@Entity
public class Genero extends Entidade{
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String Nome;
}
