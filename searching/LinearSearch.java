package searching;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int size,i,search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter an element to search:");
		search=sc.nextInt();
		int f=0;
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				f=1;break;
			}
		}
		if(f==1)
		{
			System.out.println(search+" is found at position "+(i+1));
		}
		else
		{
			System.out.println(search+"isn't found in the array");
		}
		// TODO Auto-generated method stub

	}

}
