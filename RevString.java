package june18;
import java.util.Scanner;
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);
		s.close();
	}
}
