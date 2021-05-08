package com.projeto.dsvendas.dto;

import com.projeto.dsvendas.modelo.Vendedor;
import java.io.Serializable;
import javax.persistence.Column;

public class SomaVendaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "sellerName")
    private String nomeVendedor;

    @Column(name = "sum")
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
