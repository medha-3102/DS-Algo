package matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int a[][] = { 	{1,3,5},
						{10,11,16},
						{23,30,34},
						{36,40,50}
				};
		int row = a.length;
		int col = a[0].length;
		int count = 0;
		int total = row*col;
		
		int startingRow = 0;
		int startingCol = 0;
		int endingRow = row-1;
		int endingCol = col-1;
			while(count <total){
				//starting row
			for(int i=startingCol;i<=endingCol && count<total;i++) {
				System.out.print(a[startingRow][i]+" ");
				count++;
			}
			startingRow++;
			//ending column
			for(int i=startingRow;i<=endingRow && count<total;i++) {
				System.out.print(a[i][endingCol]+" ");
				count++;
		}	
			endingCol--;
			//ending row
			for(int i=endingCol;i>=startingCol &&count<total;i--) {
				System.out.print(a[endingRow][i]+" ");
				count++;
			}
			endingRow--;
			//starting column
			for(int i=endingRow;i>=startingRow &&count<total;i--) {
				System.out.print(a[i][startingCol]+" ");
				count++;
			}
			startingCol++;
			
	}
		// TODO Auto-generated method stub

	}

}
