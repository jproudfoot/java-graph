
public class TravelingSalesmanVertex<E> extends Vertex<E>{

	public int x, y;
	
	public TravelingSalesmanVertex(E value, int x, int y) {
		super(value, 0);
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Searches for the closest vertex by comparing weights and returns the vertex with the smallest weight
	 * @return closest vertex
	 */
	public TravelingSalesmanVertex<E> traverseClosest() {
		visit();
		
		int closest = -1;
		for (int x = 0; x < edges.size(); x++) {
			if (!edges.get(x).isVisited()) {
				if (closest == -1) {
					closest = x;
					continue;
				}
				else if (weights.get(x) < weights.get(closest)) {
					closest = x;
					continue;
				}
			}
		}
		
		if (closest == -1) {
			return null;
		}
		else return (TravelingSalesmanVertex<E>) edges.get(closest);
	}
	
	/**
	 * Calculates and returns the weight of traveling to this node based on the distance between this vertex and another vertex
	 * @return int weight
	 */
	@Override
	public double calculateWeight(Vertex<E> v) {
		return Math.sqrt(Math.pow(x - ((TravelingSalesmanVertex<E>) v).x, 2)  + Math.pow(y - ((TravelingSalesmanVertex<E>) v).y, 2));
	}
}
