package flue.model;

import java.time.LocalDateTime;
import java.util.List;

public class Usuario {
	private String nome;
	private String email;
	private String usuario;
	private List<String> idiomas;
	private LocalDateTime nascimento;
	private Boolean ativo;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String email, String usuario, List<String> idiomas, LocalDateTime nascimento,
			Boolean ativo) {
		super();
		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.idiomas = idiomas;
		this.nascimento = nascimento;
		this.ativo = ativo;
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
