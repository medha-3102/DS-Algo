package searchingAndSorting;

public class MiddleOfThree {

	public static void main(String[] args) {
		int a =15,b=30,c=8;
		int x = a-b;
		int y = b-c;
		int z = a-c;
		if(x*y>0)
			System.out.println(b);
		else if(x*z>0)
			System.out.println(c);
		else
			System.out.println(a);
		
		// TODO Auto-generated method stub

	}// O(1) and O(1) compar = 3

}
