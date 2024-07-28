
//Check Whether a Given Number is Prime or Not in Java.

import java.util.Scanner;

public class Main {



		private static String checkPrime ( int n){
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return "not prime";
				}
			}
			return "prime";
		}

		public static void main (String[]args)
		{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			System.out.println(checkPrime(n));

		}
	}
