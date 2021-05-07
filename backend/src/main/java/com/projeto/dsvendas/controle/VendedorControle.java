package com.projeto.dsvendas.controle;

import com.projeto.dsvendas.dto.VendedorDto;
import com.projeto.dsvendas.servico.VendedorServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class VendedorControle {

    @Autowired
    private VendedorServico servico;

    @GetMapping
    public ResponseEntity<List<VendedorDto>> findAll() {

        List<VendedorDto> list = servico.findAll();

        return ResponseEntity.ok(list); //no corpo da resposta vai retornar a lista de vendedores com status ok 200

    }

}
