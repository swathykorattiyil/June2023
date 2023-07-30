package june19;
//convert string to integer
import java.util.Scanner;
public class stringtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String =");
		str=s.nextLine();
		//int length = str.length();
		int i = Integer.parseInt(str); 
		System.out.println(i);  
		s.close();
	}
	

}
