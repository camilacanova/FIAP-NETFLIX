package netflix.catalogoAPI.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public boolean ativo;
	@ManyToMany(mappedBy = "tags")
	private List<Filme> filmes;
	public String nome;
	
	@JsonBackReference
	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	} 
}
