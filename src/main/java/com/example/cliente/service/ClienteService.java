package com.example.cliente.service;

import com.example.cliente.dto.ClienteRequest;
import com.example.cliente.entity.Cliente;
import com.example.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criar(ClienteRequest request) {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getNome());
        cliente.setDataNascimento(request.getDataNascimento());
        cliente.setEndereco(request.getEndereco());
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscar(String id) {
        return repository.findById(id).orElseThrow();
    }

    public Cliente atualizar(String id, ClienteRequest request) {
        Cliente cliente = buscar(id);
        cliente.setNome(request.getNome());
        cliente.setDataNascimento(request.getDataNascimento());
        cliente.setEndereco(request.getEndereco());
        return repository.save(cliente);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}