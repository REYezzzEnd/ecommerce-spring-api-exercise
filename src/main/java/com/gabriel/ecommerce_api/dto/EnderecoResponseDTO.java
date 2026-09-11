package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.Endereco;

public record EnderecoResponseDTO(
        String rua,
        String bairro,
        String cep
) {

    public EnderecoResponseDTO(Endereco endereco) {
        this(
                endereco.getRua(),
                endereco.getBairro(),
                endereco.getCep()
        );
    }
}

