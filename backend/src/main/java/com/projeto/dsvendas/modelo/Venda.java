package com.projeto.dsvendas.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "visited")
    private Integer quantidadeVisita;

    @Column(name = "deals")
    private Integer negocioFechado;

    @Column(name = "amount")
    private Double quantidadeVendida;

    @Column(name = "date")
    private LocalDate data;

    @ManyToOne  //muitas vendas para um vendedor
    @JoinColumn(name = "seller_id")
    private Vendedor vendedor;

    
    
    public Venda(Long id, Integer quantidadeVisita, Integer negocioFechado, Double quantidadeVendida, LocalDate data, Vendedor vendedor) {
        this.id = id;
        this.quantidadeVisita = quantidadeVisita;
        this.negocioFechado = negocioFechado;
        this.quantidadeVendida = quantidadeVendida;
        this.data = data;
        this.vendedor = vendedor;
    }
    
    

    public Venda() {
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeVisitas() {
        return quantidadeVisita;
    }

    public void setQuantidadeVisita(Integer quantidadeVisita) {
        this.quantidadeVisita = quantidadeVisita;
    }

    public Integer getNegociosFechado() {
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
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
    

}
