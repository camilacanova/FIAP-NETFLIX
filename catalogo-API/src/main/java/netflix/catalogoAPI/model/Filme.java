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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Filme {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private boolean Ativo;
	private String Nome;
	private String Descricao;
	private int AnoLancamento;
	private Date DataDisponibilidadeInicial;
	private Date DataDisponibilidadeFinal;
	private String ClassificacaoIndicativa;
	private int Relevancia;
	@OneToOne
	private Genero Genero;
	
	/*@ManyToMany(targetEntity=Tag.class, fetch=FetchType.EAGER)
    @JoinColumn(name="tag_id")
	public List<Tag> Tags;
	*/	

	@OneToMany(targetEntity=Categoria.class, fetch=FetchType.EAGER)
	private List<Categoria> Categorias;
		
	public String getNome() {
		return Nome;
	}
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getAnoLancamento() {
		return AnoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		AnoLancamento = anoLancamento;
	}
	public Date getDataDisponibilidadeInicial() {
		return DataDisponibilidadeInicial;
	}
	public void setDataDisponibilidadeInicial(Date dataDisponibilidadeInicial) {
		DataDisponibilidadeInicial = dataDisponibilidadeInicial;
	}
	public Date getDataDisponibilidadeFinal() {
		return DataDisponibilidadeFinal;
	}
	public void setDataDisponibilidadeFinal(Date dataDisponibilidadeFinal) {
		DataDisponibilidadeFinal = dataDisponibilidadeFinal;
	}
	/*public List<Tag> getTags() {
		return Tags;
	}
	public void setTags(List<Tag> tags) {
		Tags = tags;
	}
	*/
	
	public Genero getGenero() {
		return Genero;
	}
	public void setGenero(Genero generos) {
		Genero = generos;
	}
	
	public List<Categoria> getCategorias() {
		return Categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		Categorias = categorias;
	}
	public String getClassificacaoIndicativa() {
		return ClassificacaoIndicativa;
	}
	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		ClassificacaoIndicativa = classificacaoIndicativa;
	}
	public int getRelevancia() {
		return Relevancia;
	}
	public void setRelevancia(int relevancia) {
		Relevancia = relevancia;
	}
	
}
