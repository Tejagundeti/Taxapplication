package com.anurag.taxapplication;

public interface Tax {
	void setTaxableAmount(double amount);
	void calculateTaxAmount();
	double getTaxAmount();
	String getTaxType();
	boolean isTaxPayed();
	void payTax();
}
