package netflix.model;

import javax.persistence.Entity;

@Entity
public class Tag extends Entidade {
	public String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	} 
}
