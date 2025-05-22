package com.financeiro.domain.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;



public record DadosEndereco(
        @NotBlank(message = "Logradouro é obrigatório")
        String logradouro,

        @NotBlank(message = "Bairro é obrigatório")
        String bairro,

        @NotBlank(message = "CEP é obrigatório")
        @Pattern(regexp = "\\d{8}", message = "CEP deve conter 8 dígitos numéricos (sem traço)")
        String cep,

        @NotBlank(message = "Cidade é obrigatória")
        String cidade,

        @NotBlank(message = "Estado é obrigatório")
        String estado,

        String complemento, // Opcional

        String numero // Opcional
) {}
