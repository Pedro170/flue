package flue.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

/**
 * @author pedro
 *
 */
@Entity(name = "usuarios")
@Table(name = "T_FLUE_USUARIOS")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;
	
	@Column(name = "NM_NOME")
	private String nome;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NR_TELEFONE")
	private String telefone;
	
	@Column(name = "ID_USUARIO")
	private String usuario;
	
	@Column(name = "IDIOMAS")
	private List<String> idiomas;
	
	@Column(name = "DT_NASCIMENTO")
	private LocalDateTime nascimento;
	
	@Column(name = "ATIVO")
	private Boolean ativo;
	
	public Usuario() {
		
	}

	public Usuario(Long id, String nome, String email, String telefone, String usuario, List<String> idiomas,
			LocalDateTime nascimento, Boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.usuario = usuario;
		this.idiomas = idiomas;
		this.nascimento = nascimento;
		this.ativo = ativo;
	}
	
	public Usuario (DadosCadastroUsuario dados) {
		this.ativo = true;
		this.id = dados.id();
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.usuario = dados.usuario();
		this.idiomas = dados.idiomas();
		this.nascimento = dados.nascimento();
	}
	
	public void aualizarInformacoes(@Valid DadosAtualizacaoUsuario dados) {
		if( dados.nome() != null )
			this.nome = dados.nome();
		if( dados.telefone() != null )
			this.telefone = dados.telefone();
		if( dados.idiomas() != null )
			this.idiomas = dados.idiomas();
	}
	
	public void excluir() {
		this.ativo = false;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}

	public LocalDateTime getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDateTime nascimento) {
		this.nascimento = nascimento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
