package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BankExecutive;
import com.bank.repository.BankExecutiveRepository;

@Service
public class BankExecutiveService {
	
	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;

	public BankExecutive postbankExecutive(BankExecutive bankExecutive) {
		return bankExecutiveRepository.save(bankExecutive);
	}


	
	

}
