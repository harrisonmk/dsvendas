package com.projeto.dsvendas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.dsvendas.modelo.Vendedor;
import java.io.Serializable;

public class VendedorDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    
    @JsonProperty("name")
    private String nome;

    
    public VendedorDto(Vendedor vendedor) {
        this.id = vendedor.getId();
        this.nome = vendedor.getNome();
    }

    public VendedorDto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public VendedorDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
