package com.anurag.taxapplication;

public class IncomeTax implements Tax {
	double taxableAmount;
	double taxAmount;
	boolean isTaxPayed=false;
	@Override
	public void setTaxableAmount(double amount) {
		this.taxableAmount=amount;
	}

	@Override
	public void calculateTaxAmount() {
		
		if(this.taxableAmount>300000 && this.taxableAmount<=600000) {
			this.taxAmount=(this.taxableAmount*5)/100; 
			
		}
		else if(this.taxableAmount>600000 && this.taxableAmount<=900000){
			
			this.taxAmount=(this.taxableAmount*5)/100; 
		}

	}

	@Override
	public double getTaxAmount() {
		return this.taxAmount;
	}

	@Override
	public String getTaxType() {
		return "income";
	}

	@Override
	public boolean isTaxPayed() {
		if(isTaxPayed) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void payTax() {
		System.out.println("thank you for paying your TAX");
		isTaxPayed=true;

	}

}
