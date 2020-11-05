package graph;
import java.util.LinkedList;
import java.util.*;
public class BfsOfGraph{
	private int v;
	private LinkedList<Integer> a[];
	BfsOfGraph(int v){
		this.v=v;
		a=new LinkedList[v];
		for(int i=0;i<v;i++)
			a[i]=new LinkedList();
	}
	void addEdge(int v,int w) {
	a[v].add(w);
	}
	public static void main(String[] args) {
	BfsOfGraph g1=new BfsOfGraph(4);
	g1.addEdge(0,1);
	g1.addEdge(0,2);
	g1.addEdge(1,2);
	g1.addEdge(2,0);
	g1.addEdge(2,3);
	g1.addEdge(3,3);
	//System.out.println();
		g1.BFS(2);
		// TODO Auto-generated method stub

	}
	public void BFS(int s) {
		boolean visited[]=new boolean[v];
		LinkedList<Integer> queue=new LinkedList();
		visited[s]=true;
		queue.add(s);
	
	while(queue.size()!=0) {
		s=queue.poll();
		System.out.print(s+" ");
		Iterator<Integer> i=a[s].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				visited[n]=true;
				queue.add(n);
			}
		}
	}
	}
}
