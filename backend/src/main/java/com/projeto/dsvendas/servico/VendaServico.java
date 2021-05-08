package com.projeto.dsvendas.servico;

import com.projeto.dsvendas.dto.SomaVendaDto;
import com.projeto.dsvendas.dto.VendaDto;
import com.projeto.dsvendas.dto.VendaSucedidaDto;
import com.projeto.dsvendas.modelo.Venda;
import com.projeto.dsvendas.repositorio.VendaRepositorio;
import com.projeto.dsvendas.repositorio.VendedorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendaServico {

    @Autowired
    private VendaRepositorio vendaRepositorio;

    @Autowired
    private VendedorRepositorio vendedorRepositorio;

    
    
    // retorna uma lista paginada
    @Transactional(readOnly = true) //readyOnly apenas para operacao de leitura
    public Page<VendaDto> findAll(Pageable pageable) {

        vendedorRepositorio.findAll();
        Page<Venda> resultado = vendaRepositorio.findAll(pageable);

        return resultado.map(x -> new VendaDto(x));

    }

    
    //Retorna  a soma agrupada das vendas
    @Transactional(readOnly = true) //readyOnly apenas para operacao de leitura
    public List<SomaVendaDto> amountGroupBySeller() {

        return vendaRepositorio.amountGroupBySeller();

    }
    
    
    @Transactional(readOnly = true) //readyOnly apenas para operacao de leitura
    public List<VendaSucedidaDto> successGroupBySeller() {

        return vendaRepositorio.successGroupBySeller();

    }
    
    

}
