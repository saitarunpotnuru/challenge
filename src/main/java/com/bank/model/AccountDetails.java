package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AccountDetails {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String dateOfCreation;
	
	@ManyToOne
	private AccountHolder accountHolder;
	
	@ManyToOne
	private Account account;
	
	@ManyToOne
	private BankExecutive bankExecutive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public BankExecutive getBankExecutive() {
		return bankExecutive;
	}

	public void setBankExecutive(BankExecutive bankExecutive) {
		this.bankExecutive = bankExecutive;
	}

	@Override
	public String toString() {
		return "AccountDetails [id=" + id + ", dateOfCreation=" + dateOfCreation + ", accountHolder=" + accountHolder
				+ ", account=" + account + ", bankExecutive=" + bankExecutive + "]";
	}
	
	

}
