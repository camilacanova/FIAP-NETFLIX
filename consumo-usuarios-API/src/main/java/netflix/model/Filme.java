package netflix.model;

import java.util.Date;
import java.util.List;

public class Filme extends Entidade{
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
	public List<Tag> getTags() {
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
	public String Nome;
	public String Descricao;
	public int AnoLancamento;
	public Date DataDisponibilidadeInicial;
	public Date DataDisponibilidadeFinal;
	public List<Tag> Tags;
	public List<Genero> Generos;
	public List<Categoria> Categorias;
	public String ClassificacaoIndicativa;
	public int Relevancia;
}
