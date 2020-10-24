package netflix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag extends Entidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Id;
	
	public String Nome;
	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	} 
}
