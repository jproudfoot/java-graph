import vector.Vector;

public class Vertex<E> {
	protected Vector<Vertex<E>> edges;
	protected Vector<Double> weights;
	protected E value;
	protected int weight;
	protected boolean visited;
	
	public Vertex (E value, int w) {
		this.edges = new Vector<Vertex<E>>();
		this.weights = new Vector<Double>();
		this.setValue(value);
		this.visited = false;
		this.weight = w;
	}

	/**
	 * Adds a new connection with a vertex and a weight corresponding to the vertex
	 * @param v Vertex
	 * @param i weight
	 */
	private void connect (Vertex<E> v, double d) {
		edges.add(v);
		weights.add(d);
	}
	
	/**
	 * Adds a two way connection between this node and the parameter vertex
	 * @param v Vertex
	 * @param i weight
	 */
	public void addTwoWayConnection (Vertex<E> v) {
		connect(v, v.calculateWeight(this));
		v.connect(this, calculateWeight(v));
	}
	
	/**
	 * Adds a one way connection between this node and the parameter vertex
	 * @param v Vertex
	 * @param i weight
	 */
	public void addOneWayConnection (Vertex<E> v) {
		connect(v, v.calculateWeight(this));
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
	public Vector<Double> getWeights () {
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
	 * Calculates and returns the weight of traveling to this node
	 */
	public double calculateWeight(Vertex<E> v) {
		return weight;
	}
}
