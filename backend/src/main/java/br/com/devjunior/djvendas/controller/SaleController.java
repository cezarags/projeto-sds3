package br.com.devjunior.djvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjunior.djvendas.Service.SaleService;
import br.com.devjunior.djvendas.dto.SaleDTO;
import br.com.devjunior.djvendas.dto.SaleSucessDTO;
import br.com.devjunior.djvendas.dto.SaleSumDTO;


@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = saleService.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> list = saleService.amountGroupedBySeller();
		return ResponseEntity.ok().body(list);

}
	
	@GetMapping("/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
		List<SaleSucessDTO> list = saleService.sucessGroupedBySeller();
		return ResponseEntity.ok().body(list);
}
}
