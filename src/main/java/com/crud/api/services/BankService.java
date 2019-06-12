package com.crud.api.services;

import java.util.List;
import java.util.Optional;

import com.crud.api.documents.Bank;

public interface BankService {

	
	List<Bank> listAll();
	
	Optional<Bank> listById(String id);
	
	Bank create(Bank bank);
	
	Bank update(Bank bank);
	
	void remove(String id); 
	
}
