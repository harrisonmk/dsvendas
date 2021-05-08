
package com.projeto.dsvendas.dto;

import com.projeto.dsvendas.modelo.Vendedor;
import javax.persistence.Column;


public class VendaSucedidaDto {
    
    @Column(name = "sellerName")
    private String nomeVendedor;
    
    @Column(name = "visited")
    private Long visitado;
    
     @Column(name = "deals")
    private Long negocioFechado;
     
     

    public VendaSucedidaDto(Vendedor vendedor, Long visitado, Long negocioFechado) {
        this.nomeVendedor = vendedor.getNome();
        this.visitado = visitado;
        this.negocioFechado = negocioFechado;
    }
     
       

    public VendaSucedidaDto() {
    }
     
     
     
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Long getVisitado() {
        return visitado;
    }

    public void setVisitado(Long visitado) {
        this.visitado = visitado;
    }

    public Long getNegocioFechado() {
        return negocioFechado;
    }

    public void setNegocioFechado(Long negocioFechado) {
        this.negocioFechado = negocioFechado;
    }
     
     
     
    
}
