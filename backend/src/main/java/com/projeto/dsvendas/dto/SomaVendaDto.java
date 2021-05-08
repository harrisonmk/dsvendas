package com.projeto.dsvendas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.dsvendas.modelo.Vendedor;
import java.io.Serializable;

public class SomaVendaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("sellerName")
    private String nomeVendedor;

    @JsonProperty("sum")
    private Double soma;
    
    

    public SomaVendaDto(Vendedor vendedor, Double soma) {
        this.nomeVendedor = vendedor.getNome();
        this.soma = soma;
    }

    public SomaVendaDto() {
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }
    
    
    

}
