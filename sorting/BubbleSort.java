package sorting;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int i,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			boolean sorted = true;
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted= false;
				}
			}
			if(sorted)break;
		}
		System.out.println("Sorted list in ascending order:");
			//for(i=0;i<n;i++)
		for(int item:arr)
				System.out.println(item);
		// TODO Auto-generated method stub

	}

}
