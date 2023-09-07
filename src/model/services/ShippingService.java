package model.services;

import model.entities.Invoice;
import model.entities.ProductShipping;

public class ShippingService {

	private TaxService taxService;
	private ProductShipping ps;
	
	
	public ShippingService(TaxService taxService, ProductShipping ps) {
		this.taxService = taxService;
		this.ps = ps;
	}



	public void ProcessInvoice (ProductShipping productShipping) {
		
		double basicPayment = ps.getPrice() * ps.getQuantity();
		
		double tax = taxService.tax(basicPayment);
		
		productShipping.setInvoice(new Invoice(basicPayment, tax));
	}
}
