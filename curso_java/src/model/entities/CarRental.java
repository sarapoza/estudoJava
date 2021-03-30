package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finsih;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date start, Date finsih, Vehicle vehicle) {
		this.start = start;
		this.finsih = finsih;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinsih() {
		return finsih;
	}

	public void setFinsih(Date finsih) {
		this.finsih = finsih;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
