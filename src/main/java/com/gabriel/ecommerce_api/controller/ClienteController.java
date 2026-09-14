package com.gabriel.ecommerce_api.controller;

import com.gabriel.ecommerce_api.dto.CadastroClienteDTO;
import com.gabriel.ecommerce_api.dto.ClienteResponseDTO;
import com.gabriel.ecommerce_api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> buscarTodos(){
        List<ClienteResponseDTO> clientes = clienteService.listarClientes();

        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> adicionarCliente(@RequestBody CadastroClienteDTO cliente){
        ClienteResponseDTO clienteDto = clienteService.cadastrarCliente(cliente);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clienteDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> procurarCliente(@PathVariable Long id){
        var cliente = clienteService.buscarClientePorID(id);

        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeletarCliente(@PathVariable Long id){
        clienteService.deletarCliente(id);

        return ResponseEntity.noContent().build();
    }
}
