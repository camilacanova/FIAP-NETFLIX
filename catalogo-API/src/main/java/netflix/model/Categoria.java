package netflix.model;

import javax.persistence.Entity;

@Entity
public class Categoria extends Entidade {
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String Nome; 
}
