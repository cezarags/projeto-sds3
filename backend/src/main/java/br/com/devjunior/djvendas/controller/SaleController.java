package br.com.devjunior.djvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjunior.djvendas.Service.SaleService;
import dto.SaleDTO;

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

}