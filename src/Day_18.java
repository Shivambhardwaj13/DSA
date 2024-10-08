/*
Given a string s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. Then, print the number of
tokens, followed by each token on a new line.

Input Format

A single string, s. s is composed of English alphabetic letters, blank spaces, and any of the following characters: !,?._'@

	Constraints
* 1<= length of s <+4.15^5

 * s is composed of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,),
 question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer,n, denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s .

Sample Input

He is a very, very good boy, isn't he?

Sample Output
10

He
is
a
very,
very
good
boy,
isn't
he
 */
import java.io.*;
import java.util.*;

public class Day_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim().trim();
		// Write your code here.
		scan.close();
		if(s.length() != 0 ){
			args = s.split("[ !,?._'@]+");
			System.out.println(args.length);
			for (String string : args) {
				System.out.println(string);
			}
		}
		else{
			System.out.println(0);
		}

	}
}
