import vector.Vector;

public class Graph<E> {
	private Vector<Vertex<E>> nodes;
	private Vertex position;
	
	public Graph () {
		nodes = new Vector<Vertex<E>>();
	}
	
	public Graph (Vector<Vertex<E>> nodes) {
		nodes = new Vector<Vertex<E>>();
		
		for (Vertex<E> v : nodes) {
			this.nodes.add(v);
		}
	}
	
	/**
	 * Adds a vertexes to the graph
	 * @param vertexs
	 */
	public void add (Vertex<E> ...vertexs) {
		for (Vertex<E> v : vertexs) {
			nodes.add(v);
		}
	}
}
