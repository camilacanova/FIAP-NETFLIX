package netflix.catalogoAPI.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Filme {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private boolean ativo;
	private String nome;
	private String descricao;
	private int anoLancamento;
	private Date dataDisponibilidadeInicial;
	private Date dataDisponibilidadeFinal;
	private String classificacaoIndicativa;
	private int relevancia;
	private int visualizacoes;
	
	@JsonManagedReference
	@ManyToMany
	@JoinTable(name="genero_filme", joinColumns=@JoinColumn(name="filme_id"), inverseJoinColumns = @JoinColumn(name="genero_id"))
	private List<Genero> generos;
	
	@JsonManagedReference
	@ManyToMany
	@JoinTable(name="tag_filme", joinColumns=@JoinColumn(name="filme_id"), inverseJoinColumns = @JoinColumn(name="tag_id"))
	private List<Tag> tags;	

	@JsonManagedReference
	@ManyToMany
	@JoinTable(name="categoria_filme", joinColumns=@JoinColumn(name="filme_id"), inverseJoinColumns = @JoinColumn(name="categoria_id"))
	private List<Categoria> categorias;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Date getDataDisponibilidadeInicial() {
		return dataDisponibilidadeInicial;
	}

	public void setDataDisponibilidadeInicial(Date dataDisponibilidadeInicial) {
		this.dataDisponibilidadeInicial = dataDisponibilidadeInicial;
	}

	public Date getDataDisponibilidadeFinal() {
		return dataDisponibilidadeFinal;
	}

	public void setDataDisponibilidadeFinal(Date dataDisponibilidadeFinal) {
		this.dataDisponibilidadeFinal = dataDisponibilidadeFinal;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public int getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(int relevancia) {
		this.relevancia = relevancia;
	}

	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}
	
	
}
