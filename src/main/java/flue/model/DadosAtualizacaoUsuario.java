package flue.model;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
		@NotNull
		Long id,
		String nome,
		String telefone,
		List<String> idiomas
		) {}
