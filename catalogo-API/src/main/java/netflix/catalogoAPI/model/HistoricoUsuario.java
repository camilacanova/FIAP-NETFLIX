package netflix.catalogoAPI.model;

public class HistoricoUsuario {

	private Long id;
	private boolean ativo;
	private Usuario usuario;
	private Long idFilme;
	private Filme filme;
		
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Long getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(Long idFilme) {
		this.idFilme = idFilme;
	}
}
