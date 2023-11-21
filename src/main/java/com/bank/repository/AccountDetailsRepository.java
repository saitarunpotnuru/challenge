package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>{

}
