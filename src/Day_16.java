
/*
The dictionary meaning of the word anagram is a word or phrase formed by rearranging the letters.

Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string. In other words, we can say that two strings are anagrams if they contain the same characters but in different order. Note that a letter has to be used only once.

Problem Statement:

Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format
The first line contains a string a.
The second line contains a string b.

Constraints
1<= length(a),length(b) <= 50
Strings a and b consist of English alphabetic characters.
The comparison should NOT be case-sensitive.
Sample Input 1:
anagram
margana

Sample Output 1:

Not Anagrams

Sample Input 2:
Hello
hello

Sample Output 2:

Anagrams
 */



import java.util.Scanner;

public class Day_16 {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		String A=a.toLowerCase();
		String B=b.toLowerCase();

		if(A.length()!=B.length()) return false;
		for(int i=0;i<A.length();i++)
		{
			int countA=0;
			int countB=0;
			for(int j=0;j<A.length();j++){
				if (A.charAt(i)==A.charAt(j)) countA++;

				if (A.charAt(i)==B.charAt(j)) countB++;
			}
			if(countA==countB)  continue;
			else  return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
