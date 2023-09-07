package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.ProductShipping;
import model.entities.TV;
import model.services.BrazilTaxService;
import model.services.ShippingService;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		System.out.println("Model: ");
		sc.nextLine();
		String model = sc.nextLine();
		
		ProductShipping ps = new ProductShipping(number, price, quantity, new TV(model));
		
		ShippingService service = new ShippingService(new BrazilTaxService(), ps);
		
		service.ProcessInvoice(ps);
		
		System.out.println(ps.getInvoice().totalPayment());
		
		
		sc.close();
	}

}
