package twoDArrays;

public class ReplaceO2X {

	public static void main(String[] args) {// T = O(r*c) S =O(1)
		// TODO Auto-generated method stub
		char a[][] = 		 {{'X','X','O','X'},	
							  {'X','O','X','X'},
							  {'X','O','X','X'},
							  {'X','X','O','X'},
							  {'X','X','O','X'}};
AB b = new AB();
b.solve(a);
	}
	
}
class AB{
	public void solve(char[][] board) {
		int R = board.length;
		if(R<=2) return;
		int C = board[0].length;
		if(C<=2) return;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(board[i][j]=='O'&&(i==0||i==R-1||j==0||j==C-1)) 
					dfs(board,i,j);
				}
			}
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					if(board[i][j]=='O') board[i][j]='X';
					else if(board[i][j]=='A') board[i][j]='O';
				}
		}
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					System.out.print(board[i][j]);
					}
				System.out.println();
				}
	}
	void dfs(char[][] board, int i,int j) {
		if(i>=0&&i<board.length&&j>=0&&j<board.length&& board[i][j]=='O') {
			board[i][j]='A';
			dfs(board,i+1,j);
			dfs(board,i-1,j);
			dfs(board,i,j+1);
			dfs(board,i,j-1);
				
		}
	}
}