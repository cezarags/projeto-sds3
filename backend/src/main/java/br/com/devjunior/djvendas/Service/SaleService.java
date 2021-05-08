package br.com.devjunior.djvendas.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devjunior.djvendas.models.Sale;
import br.com.devjunior.djvendas.repository.SaleRepository;
import br.com.devjunior.djvendas.repository.SellerRepository;
import br.com.devjunior.djvendas.dto.SaleDTO;
import br.com.devjunior.djvendas.dto.SaleSucessDTO;
import br.com.devjunior.djvendas.dto.SaleSumDTO;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepo;
	
	
	@Autowired
	private SellerRepository seleRepo;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		seleRepo.findAll();
		Page<Sale> result = saleRepo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepo.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> sucessGroupedBySeller(){
		return saleRepo.sucessGroupedBySeller();
	}

}
