import vector.Vector;

public class Vertex<E> {
	private Vector<Vertex<E>> edges;
	private Vector<Integer> weights;
	private E value;
	private int weight;
	private boolean visited;
	
	public Vertex (E value) {
		this.edges = new Vector<Vertex<E>>();
		this.weights = new Vector<Integer>();
		this.setValue(value);
		this.visited = false;
		this.weight = weight;
	}

	/**
	 * Adds a new connection with a vertex and a weight corresponding to the vertex
	 * @param v Vertex
	 * @param i weight
	 */
	private void connect (Vertex<E> v, int i) {
		edges.add(v);
		weights.add(i);
	}
	
	/**
	 * Adds a two way connection between this node and the parameter vertex
	 * @param v Vertex
	 * @param i weight
	 */
	public void addTwoWayConnection (Vertex<E> v, int i) {
		connect(v, i);
		v.connect(this, getWeight());
	}
	
	/**
	 * Adds a one way connection between this node and the parameter vertex
	 * @param v Vertex
	 * @param i weight
	 */
	public void addOneWayConnection (Vertex<E> v, int i) {
		connect(v, i);
	}
	
	/**
	 * Marks the vertex as having been visited
	 */
	public void visit() {
		visited = true;
	}
	
	/**
	 * Has this vertex been traversed
	 * @return boolean visited
	 */
	public boolean isVisited () {
		return visited;
	}
	
	/**
	 * Returns a vector containing the weights of all edges of this vertex
	 * @return Vector<Integer> weights
	 */
	public Vector<Integer> getWeights () {
		return weights;
	}
	
	/**
	 * Returns a vector containing the edges of this vertex
	 * @return Vector<Integer> edges
	 */
	public Vector<Vertex<E>> getEdges() {
		return edges;
	}

	/**
	 * Returns the value the vertex
	 * @return value of the vertex
	 */
	public E getValue() {
		return value;
	}

	/**
	 * Sets the value of the vertex
	 * @param value
	 */
	public void setValue(E value) {
		this.value = value;
	}
	
	/**
	 * Calculates and returns the weight of the edge
	 * @return weight
	 */
	public int getWeight () {
		return this.weight;
	}
}
