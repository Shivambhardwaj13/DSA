/*
Given a double-precision number,Payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert
  Payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

		US: formattedPayment
		India: formattedPayment
		China: formattedPayment
		France: formattedPayment
where formattedPayment is Payment formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting Payment .

			Constraints
			0<=Payment <=10^9
Output Format

On the first line, print US: u where u is Payment  formatted for US currency.
On the second line, print India: i where i is Payment formatted for Indian currency.
On the third line, print China: c where c is Payment  formatted for Chinese currency.
On the fourth line, print France: f, where f is Payment  formatted for French currency.

		Sample Input

		12324.134
		Sample Output

		US: $12,324.13
		India: Rs.12,324.13
		China: ￥12,324.13
		France: 12 324,13 €
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_11{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);

		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}