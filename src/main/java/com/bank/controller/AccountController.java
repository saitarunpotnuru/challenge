package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.AccountDto;
import com.bank.exception.InvalidIdException;
import com.bank.model.Account;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/add")
	public Account postAccount(@RequestBody Account account) {
		return accountService.post(account);

	}

	@PutMapping("/updateBalance/{accountId}")
	public ResponseEntity<?> updateBalance(@PathVariable("accountid") int accountId, @RequestBody AccountDto accountDto) {
		try {
			Account account = accountService.getone(accountId);
			
			if (accountDto.getType() != null)
				account.setType(accountDto.getType());

			if (accountDto.getRateOfIntrest() != 0)
				account.setRateOfIntrest(accountDto.getRateOfIntrest());

			if (accountDto.getBalance() != null)
				account.setBalance(accountDto.getBalance());
			account = accountService.update(account);
			return ResponseEntity.ok().body(account);
		} catch (InvalidIdException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	

}
