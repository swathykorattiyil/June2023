package june18;
import java.util.Scanner;

public class Palindrome {
	int length;
	int arr[];
	
	Palindrome() {
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter array length: ");
		length=s.nextInt();
		arr = new int[length];
		for(i=0;i<length;i++) {
			System.out.println("Enter "+(i+1)+"th number: ");
			arr[i] = s.nextInt();
		 	}
		}

	void printarray(int [] arr) {
		int i;
		System.out.print("Array is: ");
		for(i=0;i<length;i++) {
			
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int flag=1;
			Palindrome p1 = new Palindrome();
			p1.printarray(p1.arr);
			for(int i=0;i<p1.length/2;i++) {
				if(p1.arr[i]!=p1.arr[p1.length-i-1])
				{
					flag=0;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Not Palindrome");
			}
			else {
						System.out.println("Palindrome");
			}
	}		
}

	


