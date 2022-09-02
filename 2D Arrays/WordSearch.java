package twoDArrays;

public class WordSearch {

	public static void main(String[] args) {	//T = O(m*n) S= O(1)
		// TODO Auto-generated method stub
		char a[][] = 		 {{'X','X','O','X'},	
				  {'X','J','N','X'},
				  {'X','o','s','H'},
				  {'X','X','h','X'},
				  {'X','X','O','X'}};
		String s=new String("Josh");
		
		System.out.println(exist(a,s));

	}
	private static boolean search(char[][] board, int i, int j, String word, int idx) {
		if(idx==word.length()-1) return true;
		board[i][j]-=65;
		if(i>0&&board[i-1][j]==word.charAt(idx+1)&& search(board, i-1, j, word, idx+1)) 
			return true;
		if(j>0&&board[i][j-1]==word.charAt(idx+1)&& search(board, i, j-1, word, idx+1)) 
			return true;
		if(i<board.length-1&&board[i+1][j]==word.charAt(idx+1)&& search(board, i+1, j, word, idx+1)) 
			return true;
		if(j<board[0].length-1&&board[i][j+1]==word.charAt(idx+1)&& search(board, i, j+1, word, idx+1)) 
			return true;
		board[i][j]+=65;
		return false;
	}
	public static boolean exist(char board[][], String word) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==word.charAt(0) && search(board,i,j,word,0))
					return true;
			}
		}
		return false;
	}

}
