package netflix.consumousuariosAPI.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Usuario{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private boolean ativo;
	private String nome;
	private String email;
	private String login;
	
	@OneToMany(mappedBy = "usuario")
	private List<HistoricoUsuario> historico;
	
	@OneToMany(mappedBy = "usuario")
	private List<FavoritoUsuario> favoritos;
	
	@OneToMany(mappedBy = "usuario")
	private List<ListaUsuario> lista;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public List<HistoricoUsuario> getHistorico() {
		return historico;
	}
	public void setHistorico(List<HistoricoUsuario> historico) {
		this.historico = historico;
	}
	public List<FavoritoUsuario> getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(List<FavoritoUsuario> favoritos) {
		this.favoritos = favoritos;
	}
	public List<ListaUsuario> getLista() {
		return lista;
	}
	public void setLista(List<ListaUsuario> lista) {
		this.lista = lista;
	}
}
