package br.com.devjunior.djvendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.devjunior.djvendas.models.Sale;
import br.com.devjunior.djvendas.dto.SaleSucessDTO;
import br.com.devjunior.djvendas.dto.SaleSumDTO;




@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	

	
	@Query("SELECT new br.com.devjunior.djvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" + 
			"FROM Sale AS obj GROUP BY obj.seller")
			List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.devjunior.djvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals/obj.visited))" + 
			"FROM Sale AS obj GROUP BY obj.seller")
			List<SaleSucessDTO> sucessGroupedBySeller();
}


