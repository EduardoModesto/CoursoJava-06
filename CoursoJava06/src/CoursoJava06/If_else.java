package CoursoJava06;

import java.util.Locale;
import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();
		double discount;
		if (price > 20.0) {
			discount = price * 0.1;
		} else {
			discount = price * 0.05;
		}
		
		System.out.println("Product Value R$ : " + discount);
		
		sc.close();
	}

}
