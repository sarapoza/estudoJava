import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Contract;
import model.entities.Installment;
import model.entities.Vehicle;
import model.services.BrasilTaxService;
import model.services.ContractService;
import model.services.PaypalService;
import model.services.RentalServices;

public class Main {	

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer numberContract = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();
		
		Contract contract = new Contract(numberContract, date, value);
		
		System.out.print("Enter number of installments: ");
		Integer installment = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, installment);
		
		System.out.println("Installments: ");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
//		System.out.println("Enter rental data");
//		System.out.print("Car model: ");
//		String carModel = sc.nextLine();
//		System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
//		Date start = sdf.parse(sc.nextLine());
//		System.out.print("Return (dd/MM/yyyy HH:ss): ");
//		Date finish = sdf.parse(sc.nextLine());
//		
//		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
//		
//		System.out.print("Enter price per hour: ");
//		double pricePerHour = sc.nextDouble();
//		System.out.print("Enter price per day: ");
//		double pricePerDay = sc.nextDouble();
//		
//		RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrasilTaxService());
//		rentalService.processInvoice(cr);
//		
//		System.out.println("INVOICE: ");
//		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
//		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
//		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();	
	}
}
