//WJP to display duplicate characters in a string?
package june19;

import java.util.Scanner;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String =");
		str=s.nextLine();
		int length = str.length();
		char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	               
	            }
	         }
	      }
	      s.close();
	}

}
