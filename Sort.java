package june18;
import java.util.Scanner;
public class Sort {
	
	int length;
	int arr[];
	
	Sort() {
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
	
	void BubbleSort(int[]arr) {
		int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=1;j<(length-i);j++) {
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					}
			}
		}
	}
	
	void printarray(int [] arr) {
		int i;
		for(i=0;i<length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s1 = new Sort();
		System.out.println("Before Sorting!!");
		s1.printarray(s1.arr);
		s1.BubbleSort(s1.arr);
		System.out.println("After Sorting!!");
		s1.printarray(s1.arr);
		
	}
	
}
