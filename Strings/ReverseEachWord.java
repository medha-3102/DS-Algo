package strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="I Love Java Programming";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");

	}
}
