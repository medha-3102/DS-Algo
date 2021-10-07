package strings;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="medha";
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z')
				a[i] -=32;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
		System.out.println();
		for(int i =0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z')
				a[i]+=32;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		
	}

}
