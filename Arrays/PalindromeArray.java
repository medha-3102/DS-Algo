package arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		int a[] = {121,555,666};
		boolean palin=true;
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			int res=0;
			while(temp!=0) {
				res=(res*10)+(temp%10);
				temp/=10;
			}
			if(res!=a[i]) {
				palin=false;break;
			}
		}
		if(palin)
			System.out.println("1");
		else
			System.out.println("0");
		// TODO Auto-generated method stub

	}// O(N*N) & O(1)

}
