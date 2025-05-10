package com.anurag.taxapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class TaxapplicationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TaxapplicationApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Tax t=(Tax) context.getBean("incomeTax");
		t.setTaxableAmount(900000);
		t.calculateTaxAmount();
		System.out.println(t.getTaxAmount());
		t.payTax();
		
	}

}
