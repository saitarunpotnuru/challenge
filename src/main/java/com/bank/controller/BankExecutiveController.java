package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.enums.RoleType;
import com.bank.model.BankExecutive;
import com.bank.model.User;
import com.bank.repository.BankExecutiveRepository;
import com.bank.service.BankExecutiveService;
import com.bank.service.UserService;

@RestController
@RequestMapping("/executive")
public class BankExecutiveController {
	
	@Autowired
	private BankExecutiveService BankExecutiveService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public BankExecutive postBankExecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user = bankExecutive.getUser();
		user.setRole(RoleType.EXECUTIVE);
		
		user = userService.insertUser(user);
		bankExecutive.setUser(user);
		return BankExecutiveService.postbankExecutive(bankExecutive);
		
	}

}
