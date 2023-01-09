// Write a Java program to Implement the graph data structure given

class graphDataStructure {

	class Edge {
		int inDegree, outDegree;
	}

	int vertices, edges;
	Edge[] edge;

	graphDataStructure(int vertices, int edges) {
		this.vertices = vertices;
		this.edges = edges;

		edge = new Edge[edges];
		for (int i = 0; i < edges; i++) {

			edge[i] = new Edge();
		}
	}

	public static void main(String[] args) {

		int noVertices = 5;
		int noEdges = 8;
		graphDataStructure g = new graphDataStructure(noVertices, noEdges);

		g.edge[0].inDegree = 1;
		g.edge[0].outDegree = 2;

		g.edge[1].inDegree = 1;
		g.edge[1].outDegree = 3;

		g.edge[2].inDegree = 1;
		g.edge[2].outDegree = 4;

		g.edge[3].inDegree = 2;
		g.edge[3].outDegree = 4;

		g.edge[4].inDegree = 2;
		g.edge[4].outDegree = 5;

		g.edge[5].inDegree = 3;
		g.edge[5].outDegree = 4;

		g.edge[6].inDegree = 3;
		g.edge[6].outDegree = 5;

		g.edge[7].inDegree = 4;
		g.edge[7].outDegree = 5;

		for (int i = 0; i < noEdges; i++) {
			System.out.println(g.edge[i].inDegree + " - " + g.edge[i].outDegree);
		}

	}
}