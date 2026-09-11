package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.Cliente;

import java.time.LocalDate;

public record ClienteResponseDTO(
        Long id,
        String nome,
        EnderecoResponseDTO endereco,
        LocalDate dataNascimento
) {

    public ClienteResponseDTO(Cliente cliente) {
        this(
                cliente.getId(),
                cliente.getNome(),
                new EnderecoResponseDTO(cliente.getEndereco()),
                cliente.getDataNascimento()
        );
    }
}

