package com.crud.api.documents;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "banks")
public class Bank {
	
	@Id
	private String id;
	private String Bank;
	private Integer agency;
	private String address;
	
	public Bank() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotNull(message = "Nome não pode ser vazio")
	public String getBank() {
		return Bank;
	}

	public void setBank(String bank) {
		Bank = bank;
	}

	@NotNull(message = "Conta não pode ser vazio")
	public Integer getAgency() {
		return agency;
	}

	public void setAgency(Integer account) {
		this.agency = account;
	}

	@NotNull(message = "Endereço não pode ser vazio")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
