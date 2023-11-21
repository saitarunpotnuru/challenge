package com.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.exception.InvalidIdException;
import com.bank.model.Account;
import com.bank.repository.AccountRepository;

@Service
public class AccountService {
	
@Autowired
private AccountRepository accountRepository;
	public Account post(Account account) {
		return accountRepository.save(account);
	}
	public Account getone(int aid) throws InvalidIdException {
		Optional<Account> optional = accountRepository.findById(aid);
		if (!optional.isPresent())
			throw new InvalidIdException("invalid account id");
		return optional.get();
	}
	public Account update(Account account) {
		return accountRepository.save(account);
	}
	
	

}
