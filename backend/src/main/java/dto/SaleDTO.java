package dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.devjunior.djvendas.models.Sale;

public class SaleDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDateTime date;
	
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public SellerDTO getSeller() {
		return seller;
	}


	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	private SellerDTO seller;
	
	
	public SaleDTO() {
		// TODO Auto-generated constructor stub
	}


	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDateTime date, SellerDTO seller) {
	
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	

	public SaleDTO(Sale entyty) {
	
		this.id = entyty.getId();
		this.visited = entyty.getVisited();
		this.deals = entyty.getDeals();
		this.amount = entyty.getAmount();
		this.date = entyty.getDate();
		this.seller = new SellerDTO(entyty.getSeller());
	}
	
	
	
	
	

}
