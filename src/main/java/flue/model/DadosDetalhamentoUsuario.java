package flue.model;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoUsuario(
		Long id,
		String nome,
		String email,
		String telefone,
		String usuario,
		List<String> idiomas,
		LocalDateTime nascimento
		) {

	public DadosDetalhamentoUsuario(Usuario usuario) {
		this(
				usuario.getId(),
				usuario.getNome(),
				usuario.getEmail(),
				usuario.getTelefone(),
				usuario.getUsuario(),
				usuario.getIdiomas(),
				usuario.getNascimento()
			);
	}
}