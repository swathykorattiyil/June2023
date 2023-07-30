//WJp to find count uppercase lowercase 
package june19;

import java.util.Scanner;
public class upperlower {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int uc = 0;
		int lc = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String =");
		str=s.nextLine();
		int length = str.length();
		for(int i=0;i<length;i++) {
			if (Character.isUpperCase(str.charAt(i))) {
			uc = uc+1;
			}

			else if(Character.isLowerCase(str.charAt(i))) {
			lc = lc+1;
			}
		}
			System.out.println("The upper case count is= "+uc);
			System.out.println("The lower case count is= "+lc);
			s.close();
	}
		
	}
				
			
		
		
	


