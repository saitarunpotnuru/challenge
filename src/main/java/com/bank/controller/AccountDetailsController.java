package com.bank.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.dto.AccountDetailsDto;
import com.bank.exception.InvalidIdException;
import com.bank.model.Account;
import com.bank.model.AccountDetails;
import com.bank.model.AccountHolder;
import com.bank.model.BankExecutive;
import com.bank.service.AccountDetailsService;
import com.bank.service.AccountHolderService;
import com.bank.service.BankExecutiveService;

@RequestMapping("/accountdetails")
public class AccountDetailsController {
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addaccountdetails(@RequestBody AccountDetailsDto details) {
		return null;
		
		

}
}
