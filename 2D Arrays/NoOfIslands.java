package twoDArrays;

public class NoOfIslands {

	public static void main(String[] args) { //	T = O(N^2) S= O(1)
		// TODO Auto-generated method stub
		char a[][] = 		 {{'1','1','0','1','0'},	
							  {'0','1','0','0','0'},
							  {'1','1','0','0','0'},
							  {'1','1','0','0','0'}};
		X b = new X();
		System.out.println(b.numIslands(a));
	}
}
	class X {
		public int numIslands(char[][] grid) {
			if(grid.length==0)return 0;
				int islands=0;
				
			for(int i=0;i<grid.length;i++) {
				for(int j=0;j<grid[0].length;j++) {
					if(grid[i][j]=='1') {
						dfs(grid,i,j);
					++islands;
					}
				}
			}
			return islands;
		}
		void dfs(char[][] grid, int i, int j) {
			if(i<0||j<0||i>grid.length-1||j>grid[0].length-1) return;
			if(grid[i][j]=='0') return;
			grid[i][j] ='0';
			dfs(grid,i+1,j);
			dfs(grid,i-1,j);
			dfs(grid,i,j-1);
			dfs(grid,i,j+1);
				
		}
		
	}
	

