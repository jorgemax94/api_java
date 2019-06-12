package com.crud.api.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crud.api.documents.Bank;

public interface BankRepository extends PagingAndSortingRepository<Bank, String> {
	
	

}
