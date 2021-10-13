package recursionBacktracking;

public class NQueen {

	public static void main(String[] args) {
		int a[][]= {	{0,0,0},
						{0,0,0},
						{0,0,0}
						};
		System.out.println(nQueen(a,3));
		
		// TODO Auto-generated method stub

	}
	static boolean nQueen(int board[][],int row) {
		if(row ==board.length)
			return true;
		for(int col=0;col<board.length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=1;
				if(nQueen(board,row+1))
					return true;
				board[row][col]=0;
			}
		}
		return false;
	}
	static boolean isSafe(int board[][],int row,int col) {
		int i,j;
		for(i=0;i<col;i++)
			if(board[row][i]==1)
				return false;
		for(i=row,j=col;i>=0&&j>=0;i--,j--)
			if((board[i][j]==1))
				return false;
		for(i=row,j=col;j>=0&&i<board.length;i++,j--)
			if((board[i][j]==1))
				return false;
		return true;
		
	}

}
