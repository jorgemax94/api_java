package com.crud.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.crud.api.responses.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.documents.Bank;
import com.crud.api.services.BankService;

@RestController
@RequestMapping(path = "/api/banks")
public class BankController {
		
	@Autowired
	private BankService bankService;
	
	
	@GetMapping
	public ResponseEntity<Response<List<Bank>>> listAll(){
		return ResponseEntity.ok(new Response<List<Bank>>(this.bankService.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Bank>> listById(@PathVariable(name = "id") String id){
		return ResponseEntity.ok(this.bankService.listById(id));
	}
	
	@PostMapping
	public ResponseEntity<Response<Bank>> create(@Valid @RequestBody Bank bank, BindingResult result){
		
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Bank>(errors));
		}
		
		return ResponseEntity.ok(new Response<Bank>(this.bankService.create(bank)));
		
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Bank>> update(@PathVariable(name = "id") String id, @Valid @RequestBody Bank bank, BindingResult result){
		
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Bank>(errors));
		}
		
		bank.setId(id);
		return ResponseEntity.ok(new Response<Bank>(this.bankService.update(bank)));
		
	}
	
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<Response<Integer>> remove(@PathVariable(name = "id") String id){
		this.bankService.remove(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
	
}
