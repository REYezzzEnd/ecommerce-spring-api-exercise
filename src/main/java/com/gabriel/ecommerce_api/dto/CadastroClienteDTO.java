package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.Cliente;

import java.time.LocalDate;

public record CadastroClienteDTO(
        String nome,
        String rua,
        String bairro,
        String cep,
        LocalDate dataNascimento
) {
    public CadastroClienteDTO(Cliente cliente){
        this(
                cliente.getNome(),
                cliente.getEndereco().getRua(),
                cliente.getEndereco().getBairro(),
                cliente.getEndereco().getCep(),
                cliente.getDataNascimento()
        );
    }
}
