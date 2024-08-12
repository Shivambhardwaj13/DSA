/*
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

A < B <… < Y < Z < a < b < … < y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

	Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ‘ + “\n” + ‘ where and are the two substrings
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Sample Input

welcometojava
3
Sample Output

ava
wel
 */



import java.util.Scanner;

public class Day_14
{

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		smallest = largest = s.substring(0, k);


		for (int i=1; i<s.length()-k+1; i++) {
			String substr = s.substring(i, i+k);
			if (smallest.compareTo(substr) > 0)
				smallest = substr;
			if (largest.compareTo(substr) < 0)
				largest = substr;
		}


		return smallest + "\n" + largest;

	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}