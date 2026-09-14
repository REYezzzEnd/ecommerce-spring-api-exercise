package com.gabriel.ecommerce_api.service;

import com.gabriel.ecommerce_api.dto.CadastroClienteDTO;
import com.gabriel.ecommerce_api.dto.ClienteResponseDTO;
import com.gabriel.ecommerce_api.entities.Cliente;
import com.gabriel.ecommerce_api.entities.Endereco;
import com.gabriel.ecommerce_api.exceptions.ClienteNotFoundException;
import com.gabriel.ecommerce_api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteResponseDTO cadastrarCliente(CadastroClienteDTO cliente){
        var endereco = new Endereco(cliente.rua(), cliente.bairro(), cliente.cep());

        var clienteSalvo = clienteRepository.save(new Cliente(cliente.nome(), endereco,cliente.dataNascimento()));

        return new ClienteResponseDTO(clienteSalvo);
    }

    public ClienteResponseDTO buscarClientePorID(Long id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(
                () -> new ClienteNotFoundException("Nao foi achado nenhum cliente com esse id")
                );

        return new ClienteResponseDTO(cliente);
    }

    public List<ClienteResponseDTO> listarClientes(){
        List<Cliente> clientes = clienteRepository.findAll();

        return clientes.stream().map(ClienteResponseDTO::new).toList();
    }

    public void deletarCliente(Long id){
        if(!clienteRepository.existsById(id)){
            throw new ClienteNotFoundException("Cliente nao foi achado por este id: " + id);
        }
        clienteRepository.deleteById(id);
    }
}
