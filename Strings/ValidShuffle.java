package strings;
import java.util.Scanner;
public class ValidShuffle {

	public static void main(String[] args) {
		String s1="XYZ";
		String s2="12";
		Scanner sc=new Scanner(System.in);
		String s3=sc.nextLine();
		boolean b=false;
		int c=0;
		for(int i=0;i<s3.length()-1;i++ ) {
			if(s3.charAt(i)==s1.charAt(c)&&s3.charAt(i+1)==s1.charAt(++c)) {
				b=true;
			break;
			}
			
		}
		if(b)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		
		// TODO Auto-generated method stub

	}

}
