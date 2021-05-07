package br.com.devjunior.djvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjunior.djvendas.Service.SellerService;
import dto.SellerDTO;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerServ;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = sellerServ.findAll();
		return ResponseEntity.ok(list);
		
	}

}
