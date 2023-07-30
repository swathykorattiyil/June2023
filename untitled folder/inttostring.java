package june19;
//convert integer to string
import java.util.Scanner;
public class inttostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integer: ");
		a = s.nextInt();
		
		String str =String.valueOf(a);
		System.out.println("String is: "+str);
		s.close();
	}

}
