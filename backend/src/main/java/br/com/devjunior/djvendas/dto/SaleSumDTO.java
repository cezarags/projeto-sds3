package br.com.devjunior.djvendas.dto;

import java.io.Serializable;

import br.com.devjunior.djvendas.models.Seller;

public class SaleSumDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSumDTO(Seller seller, Double sum) {
		
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	
	//get and set
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
	

}
