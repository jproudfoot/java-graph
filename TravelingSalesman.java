import java.util.Random;
import java.util.Scanner;

import vector.Vector;

public class TravelingSalesman {
	public static void main (String [] args) {
		Vector<TravelingSalesmanVertex<String>> vertexs = new Vector<TravelingSalesmanVertex<String>>();
		vertexs.add(new TravelingSalesmanVertex<String>("A", 0, 0));
		vertexs.add(new TravelingSalesmanVertex<String>("B", 10, 10));
		vertexs.add(new TravelingSalesmanVertex<String>("C", 5, 5));
		vertexs.add(new TravelingSalesmanVertex<String>("D", 20, 15));
		vertexs.add(new TravelingSalesmanVertex<String>("E", 2, 100));
		
		//Connections
		for (int x = 0; x < vertexs.getSize(); x++) {
			for (int y = 0; y < vertexs.getSize(); y++) {
				if (vertexs.get(x).equals(vertexs.get(y))) continue;
				else vertexs.get(x).addOneWayConnection(vertexs.get(y));
			}
		}
		
		System.out.println("Vertexes with their weights.");
		for (int x = 0; x < vertexs.size(); x++) {
			System.out.println(vertexs.get(x).getValue() + ": " + vertexs.get(x).getWeights());
		}
		System.out.println();
		
		
		TravelingSalesmanVertex<String> position = vertexs.get(0);
		TravelingSalesmanVertex<String> closest = position;
		while (closest != null) {
			System.out.println(closest.value);
			
			
			position = closest;
			closest = position.traverseClosest();
		}
	}
}
