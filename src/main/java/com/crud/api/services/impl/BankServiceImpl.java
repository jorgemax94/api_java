package com.crud.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.documents.Bank;
import com.crud.api.repositories.BankRepository;
import com.crud.api.services.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public List<Bank> listAll() {
		
		return (List<Bank>) this.bankRepository.findAll();
				}

	@Override
	public Optional<Bank> listById(String id) {
		return this.bankRepository.findById(id);
	}

	@Override
	public Bank create(Bank bank) {
		return this.bankRepository.save(bank);
	}

	@Override
	public Bank update(Bank bank) {
		return this.bankRepository.save(bank);
	}

	@Override
	public void remove(String id) {
		this.bankRepository.deleteById(id);

	}

}
