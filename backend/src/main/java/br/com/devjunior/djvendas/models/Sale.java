package br.com.devjunior.djvendas.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDateTime date;
	
	@ManyToOne
	@JoinColumn
	private Seller seller;
	
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDateTime date, Seller seller) {
	
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}





	//get and set
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
	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
	
	
	
	
	
	
	

}
