package br.com.devjunior.djvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devjunior.djvendas.models.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
