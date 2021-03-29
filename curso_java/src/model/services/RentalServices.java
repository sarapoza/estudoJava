package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
	
	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice (CarRental carRental) {
		long instantOne = carRental.getStart().getTime();
		long instantTwo = carRental.getFinsih().getTime();
		double hours = (double) (instantTwo - instantOne) /1000/60/60;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
