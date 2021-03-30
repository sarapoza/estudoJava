package model.services;

import java.util.Date;

import model.entities.Contract;

public class PaypalService implements OnlinePaymentService{

	public static final double PAYMENT_FEE = 0.02;
	public static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double taxMounth(double amount, Integer numberInstallment) {
		return amount * numberInstallment * MONTHLY_INTEREST;
	}
	
	@Override	
	public double taxInstallment(double taxMonth) {
		return taxMonth * PAYMENT_FEE;
	}
}
