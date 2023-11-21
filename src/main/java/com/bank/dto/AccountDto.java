package com.bank.dto;

public class AccountDto {
	private int id;
	private String type;
	private double rateOfIntrest;
	private String balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRateOfIntrest() {
		return rateOfIntrest;
	}
	public void setRateOfIntrest(double rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

}
