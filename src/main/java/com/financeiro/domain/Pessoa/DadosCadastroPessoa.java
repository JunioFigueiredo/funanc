package com.financeiro.domain.Pessoa;

import com.financeiro.domain.Endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(
        @NotBlank
        String nome,
        @NotNull @Valid DadosEndereco endereco) {
}

