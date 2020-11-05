package graph;
public class Graph {
	boolean a[][];
	int v;
	public Graph(int v) {
		this.v=v;
		a=new boolean[v][v];	// TODO Auto-generated constructor stub
	}
	public void addEdge(int i,int j) {
		a[i][j]=true;
		a[j][i]=true;
	}
		public void removeEdge(int i,int j) {
			a[i][j]=false;
			a[j][i]=false;
		}
		public String sg(){
			StringBuilder s=new StringBuilder();
			for(int i=0;i<v;i++) {
				s.append(i+":");
			for(boolean j:a[i]) {
				s.append((j?1:0)+" ");
			}
			s.append("\n");
			}
			return s.toString();
		}

	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
System.out.println();
		// TODO Auto-generated method stub

	}
	


}