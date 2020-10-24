package netflix.model;

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
	public Long Id;
	public boolean Ativo;
	public String Nome;
	public String Descricao;
	public int AnoLancamento;
	public Date DataDisponibilidadeInicial;
	public Date DataDisponibilidadeFinal;
	
	/*public int tag;
	public int genero;*/
	
	/*@ManyToMany(targetEntity=Tag.class, fetch=FetchType.EAGER)
    @JoinColumn(name="tag_id")
	public List<Tag> Tags;
	*/
	
	@OneToOne
	public Genero Genero;

	@OneToMany(targetEntity=Categoria.class, fetch=FetchType.EAGER)
	public List<Categoria> Categorias;
	
	public String ClassificacaoIndicativa;
	public int Relevancia;
	
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
	
	public Genero getGeneros() {
		return Genero;
	}
	public void setGeneros(Genero generos) {
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
