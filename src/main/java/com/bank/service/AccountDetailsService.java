package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.AccountDetails;
import com.bank.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {
@Autowired
private AccountDetailsRepository accountDetailsRepository;
	public AccountDetails post(AccountDetails accountDetails) {
		return accountDetailsRepository.save(accountDetails);
	}

}
