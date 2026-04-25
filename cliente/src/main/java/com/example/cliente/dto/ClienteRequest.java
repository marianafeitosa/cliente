package com.example.cliente.dto;

import com.example.cliente.entity.Endereco;
import java.time.LocalDate;

public class ClienteRequest {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
}