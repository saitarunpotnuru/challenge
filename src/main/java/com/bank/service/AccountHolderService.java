package com.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.exception.InvalidIdException;
import com.bank.model.AccountHolder;
import com.bank.repository.AccountHolderRepository;
@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository accountHolderRepository;

	public AccountHolder postAccountHolder(AccountHolder accountHolder) {
		return accountHolderRepository.save(accountHolder);
	}

	
	
	
}
