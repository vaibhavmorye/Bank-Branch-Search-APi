package com.fylebank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fylebank.model.Bank;


@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
	Optional<Bank> findById(Long id);
	
	
}
