
package com.projeto.dsvendas.repositorio;

import com.projeto.dsvendas.modelo.Venda;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VendaRepositorio extends JpaRepository<Venda,Long> {
    
}
