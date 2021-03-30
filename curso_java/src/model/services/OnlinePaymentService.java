package model.services;

public interface OnlinePaymentService {

	double taxMounth(double amount, Integer month);
	double taxInstallment(double amount);
	
}
