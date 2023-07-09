package arrays;

public class AlternatePosNeg {
	static void rotate(int a[],int i, int w) {
int temp=a[i];
		
		for(int j=i;j>w;j--) {
			
			a[j]=a[j-1];
			
		}
		a[w]=temp;
		
	}
	
 static void display(int a[]) {
	for(int i:a)
		System.out.println(i);
		
	}
static void arrange(int a[]) {
	int wrong=-1;
	for(int i=0;i<a.length;i++) {
		if(wrong!=-1) {
			if((a[wrong]>=0 && a[i]<0) ||(a[i]>=0 && a[wrong]<0)) {
				rotate(a,i,wrong);
			if(i-wrong >=2)
				wrong +=2;
			else
				wrong=-1;
			}
		}else {
			if((i%2==0 && a[i]>0) || (i%2!=0 && a[i]<0))
				wrong=i;
		}
	}
}
	public static void main(String[] args) {
		int a[] = {-1,1,2,3,-3,2};
		arrange(a);
		display(a);
		// TODO Auto-generated method stub

	}

}
