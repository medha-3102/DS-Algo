package strings;

public class BinaryString {

	public static void main(String[] args) {
		String s="011010100";
		int count=0;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length-1;i++) {
			if(a[i]=='0'&&a[i+1]!='1') {
				a[i]='1';
				count++;
			}
				if(a[i]=='1'&&a[i+1]!='0') {
					a[i]='0';
					count++;
				}
				
		}		
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
