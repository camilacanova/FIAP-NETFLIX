package netflix.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Filme extends Entidade{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Id;
	
	public String Nome;
	public String Descricao;
	public int AnoLancamento;
	public Date DataDisponibilidadeInicial;
	public Date DataDisponibilidadeFinal;
	
	public int tag;
	public int genero;
	
	/*@ManyToMany(targetEntity=Tag.class, fetch=FetchType.EAGER)
    @JoinColumn(name="tag_id")
	public List<Tag> Tags;
	
	@OneToMany(targetEntity=Genero.class, fetch=FetchType.EAGER)
    @JoinColumn(name="genero_id")
	public List<Genero> Generos;*/

	@OneToMany(targetEntity=Categoria.class, fetch=FetchType.EAGER)
    @JoinColumn(name="categoria_id")
	public List<Categoria> Categorias;
	
	public String ClassificacaoIndicativa;
	public int Relevancia;
	
	public String getNome() {
		return Nome;
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
	public List<Genero> getGeneros() {
		return Generos;
	}
	public void setGeneros(List<Genero> generos) {
		Generos = generos;
	}
	*/
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
