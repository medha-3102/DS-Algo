package strings;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AllDuplicates {

	public static void main(String[] args) {
		String s = "ggjngjjboggkkj";
		Map<Character,Integer> count = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(count.containsKey(s.charAt(i)))
				count.put(s.charAt(i), count.get(s.charAt(i))+1);
			else
				count.put(s.charAt(i), 1);
		}
		for(Entry<Character,Integer> ele :count.entrySet()) {
			if(ele.getValue()>1)
				System.out.println(ele.getKey()+",count = "+ele.getValue());
		}
//		char a[]=s.toCha[rArray();
//		Arrays.sort(a);
//		int count=1;
//		//char counted='0';
//		int i=1;
//		while(i<a.length) {
//		
//			if(a[i-1]==a[i]) {
//				count++;
//			
//			}
//			if(count>1 && a[i-1]!=a[i]) {
//				System.out.print(a[i-1]+"="+count+" ");
//				count=1;
//			}
//			
//				i++;
//		}
		
		// TODO Auto-generated method stub

	}

}
