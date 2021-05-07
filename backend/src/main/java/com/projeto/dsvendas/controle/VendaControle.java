package com.projeto.dsvendas.controle;

import com.projeto.dsvendas.dto.VendaDto;
import com.projeto.dsvendas.servico.VendaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class VendaControle {

    @Autowired
    private VendaServico servico;

    @GetMapping
    public ResponseEntity<Page<VendaDto>> findAll(Pageable pageable) {

        Page<VendaDto> list = servico.findAll(pageable);

        return ResponseEntity.ok(list); //no corpo da resposta vai retornar a lista de vendedores com status ok 200

    }

}
