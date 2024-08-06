/*

Static initialization blocks are executed when the class is loaded, and you can initialize static
variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram
with breadth B and height H. You should read the variables from the standard input.

		If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

		Constraints
		-100<=B<=100
		-100<=H<=100


Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise
, print "java.lang.Exception: Breadth and height must be positive" without quotes.

*/


import java.io.*;
import java.util.*;
public class Day_8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i =sc.nextInt();
		int j =sc.nextInt();
		if(i <= 0 || j <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		else{
			System.out.println(i * j);
		}



	}
}
