
package com.projeto.dsvendas.repositorio;

import com.projeto.dsvendas.dto.SomaVendaDto;
import com.projeto.dsvendas.dto.VendaSucedidaDto;
import com.projeto.dsvendas.modelo.Venda;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface VendaRepositorio extends JpaRepository<Venda,Long> {
    
    @Query("SELECT new com.projeto.dsvendas.dto.SomaVendaDto(obj.vendedor,SUM(obj.quantidadeVendida))"
            + "FROM Venda AS obj GROUP BY obj.vendedor")
    List<SomaVendaDto> amountGroupBySeller();
    
    
    
    @Query("SELECT new com.projeto.dsvendas.dto.VendaSucedidaDto(obj.vendedor,SUM(obj.quantidadeVisita),SUM(obj.negocioFechado))"
            + "FROM Venda AS obj GROUP BY obj.vendedor")
    List<VendaSucedidaDto> successGroupBySeller();
    
}
