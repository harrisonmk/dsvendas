package com.projeto.dsvendas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.dsvendas.modelo.Venda;
import java.io.Serializable;
import java.time.LocalDate;

public class VendaDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonProperty("visited")
    private Integer quantidadeVisita;

    @JsonProperty("deals")
    private Integer negocioFechado;

    @JsonProperty("amount")
    private Double quantidadeVendida;

    //@JsonProperty("date")
    private LocalDate date;

    @JsonProperty("seller")
    private VendedorDto vendedor;

    
    
    public VendaDto(Venda venda) {
        this.id = venda.getId();
        this.quantidadeVisita = venda.getQuantidadeVisitas();
        this.negocioFechado = venda.getNegociosFechado();
        this.quantidadeVendida = venda.getQuantidadeVendida();
        this.date = venda.getData();
        this.vendedor = new VendedorDto(venda.getVendedor());
    }

    public VendaDto(Long id, Integer quantidadeVisita, Integer negocioFechado, Double quantidadeVendida, LocalDate data, VendedorDto vendedor) {
        this.id = id;
        this.quantidadeVisita = quantidadeVisita;
        this.negocioFechado = negocioFechado;
        this.quantidadeVendida = quantidadeVendida;
        this.date = data;
        this.vendedor = vendedor;
    }

    public VendaDto() {
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeVisita() {
        return quantidadeVisita;
    }

    public void setQuantidadeVisita(Integer quantidadeVisita) {
        this.quantidadeVisita = quantidadeVisita;
    }

    public Integer getNegocioFechado() {
        return negocioFechado;
    }

    public void setNegocioFechado(Integer negocioFechado) {
        this.negocioFechado = negocioFechado;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = data;
    }

    public VendedorDto getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorDto vendedor) {
        this.vendedor = vendedor;
    }
    
    
    

}
