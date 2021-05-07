package com.projeto.dsvendas.servico;

import com.projeto.dsvendas.dto.VendedorDto;
import com.projeto.dsvendas.modelo.Vendedor;
import com.projeto.dsvendas.repositorio.VendedorRepositorio;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorServico {
    
    @Autowired
    private VendedorRepositorio vendedorRepositorio;
    
    
    
    public List<VendedorDto> findAll() {
        
        List<Vendedor> resultado = vendedorRepositorio.findAll();
        
        return resultado.stream().map(x -> new VendedorDto(x)).collect(Collectors.toList());
        
    }
    
    
    
}
