package arrays;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		double x = sc.nextDouble();
		System.out.print("Enter the power");
		int n = sc.nextInt();
		System.out.println(myPow(x,n));
		// TODO Auto-generated method stub
	}
	static double myPow(double x,int n) {
		double ans = 1.0;
		long nn =n;
		if(nn<0) nn=-1*nn;
		while(nn>0) {
			if(nn%2==1) {
				ans = ans*x;
				nn-=1;
			}
			else {
				x=x*x;
				nn= nn/2;
			}
		}
		if(n<0) ans = (double)(1.0)/(double)(ans);
		return ans;
	}

}
