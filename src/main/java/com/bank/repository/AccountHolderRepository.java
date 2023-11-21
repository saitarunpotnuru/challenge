package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer>{

	AccountHolder save(AccountHolder accountHolder);

	

}
