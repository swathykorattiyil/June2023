package june18;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= s.nextInt();
		int mul=1;
	    int i;
	    //System.out.println(n);
		for(i=n;i>=1;i--){
		
			mul=mul * i;	
			
		}
		//System.out.println(i);
		// TODO Auto-generated method stub
		System.out.println("Factorial of "+n+ " is: "+mul);
		s.close();
	}
}
