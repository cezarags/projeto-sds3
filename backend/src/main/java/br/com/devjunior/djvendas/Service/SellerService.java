package br.com.devjunior.djvendas.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devjunior.djvendas.models.Seller;
import br.com.devjunior.djvendas.repository.SellerRepository;
import dto.SellerDTO;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll(){
		List<Seller> result = sellerRepo.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
