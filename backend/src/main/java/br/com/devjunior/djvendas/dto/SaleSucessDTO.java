package br.com.devjunior.djvendas.dto;

import java.io.Serializable;

import br.com.devjunior.djvendas.models.Seller;

public class SaleSucessDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sellerName;
	
	private Long visited;
	
	private Long deals;
	
	
	
	public SaleSucessDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public SaleSucessDTO(Seller seller, Long visited, Long deals) {
		super();
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}




	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	

}
