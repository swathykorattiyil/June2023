package june18;
import java.util.Scanner;

public class Boolean1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//Enter three booleans manually
		System.out.println("Enter first boolean : ");
		boolean a = reader.nextBoolean();
		System.out.println("Enter second boolean : ");
		boolean b= reader.nextBoolean();
		System.out.println("Enter third boolean : ");
		boolean c= reader.nextBoolean();
		
		//condition to check if at least two booleans are true
		if((a && b)|| (a && c) || (b && c))
			System.out.println("two out of three booleans are true");  
		else
			System.out.println("two out of three booleans are NOT true");
		reader.close();
		// TODO Auto-generated method stub

	}

}


//  if() then 1 else 0;