
package com.projeto.dsvendas.repositorio;

import com.projeto.dsvendas.modelo.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepositorio extends JpaRepository<Vendedor,Long> {
    
}
