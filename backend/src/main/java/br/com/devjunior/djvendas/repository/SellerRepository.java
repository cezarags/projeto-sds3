package br.com.devjunior.djvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devjunior.djvendas.models.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
