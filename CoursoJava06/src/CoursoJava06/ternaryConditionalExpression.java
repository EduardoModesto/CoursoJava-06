package CoursoJava06;

import java.util.Locale;
import java.util.Scanner;

public class ternaryConditionalExpression {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();
		double discount = (price > 20.0) ? price * 0.1 : price * 0.05;

		System.out.println("Product Value R$ : " + discount);

		sc.close();
	}

}
