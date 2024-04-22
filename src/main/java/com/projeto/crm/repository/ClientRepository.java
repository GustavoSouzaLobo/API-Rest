package com.projeto.crm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.crm.controler.model.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {
	

}
