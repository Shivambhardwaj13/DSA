

import java.text.Format;
public class Day_17 {


		public static void main(String[] args) {

/*

//	Using StringBuffer :
		String s="Sam Bhardwaj";
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		System.out.println(s);
		System.out.println(rev);

 */

//		using Loop :
//		String s = "Shivam Bhardwaj";
			String s = "jawdrahB mavihS";

			String rev = "";
			for(int i = s.length()-1 ; i>=0 ; i--){
				rev += s.charAt(i);
			}
			System.out.println(s);
			System.out.println(rev);


		}
	}

