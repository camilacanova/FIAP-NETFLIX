package netflix.catalogoAPI.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Genero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private boolean ativo;
	private String nome;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	@JsonBackReference
	@ManyToMany(mappedBy = "generos")
	private List<Filme> filmes;
		
	
}
