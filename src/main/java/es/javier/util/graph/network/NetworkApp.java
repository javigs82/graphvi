package es.javier.util.graph.network;

import es.javier.util.graph.Graph;
import es.javier.util.graph.Vertex;
import es.javier.util.graph.network.tree.NetworkNode;

/**
 * @author javi
 *
 */
public class NetworkApp {
	

	public static void main(String[] args) {
		test1();

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void test1 () {
		Graph catalog = new Graph<Station>();
		
		Vertex chamartin = new Vertex<Station>("Chamartin", new Station(1, "Chamartin"));
		catalog.setRootVertex(chamartin);
		Vertex bernabeu = new Vertex<Station>("Bernabeu", new Station(1, "Bernabeu"));
		catalog.addVertex(bernabeu);
		Vertex nuevosMinisterios = new Vertex<Station>("Nuevos Ministerios", new Station(1, "Nuevos Ministerios"));
		catalog.addVertex(nuevosMinisterios);
		Vertex cibeles = new Vertex<Station>("Cibeles", new Station(1, "Cibeles"));
		catalog.addVertex(cibeles);
		
		catalog.addEdge(chamartin, bernabeu,1);
		catalog.addEdge(chamartin, nuevosMinisterios,2);
		catalog.addEdge(bernabeu, cibeles,1);
		catalog.addEdge(nuevosMinisterios, cibeles, 1);
		
		NetworkVisitor network = new NetworkVisitor();
		
		
		catalog.javiSpanningTree(chamartin,network);
		System.out.println("Network: " + network.getTree().getName());
		for (NetworkNode node : network.getTree().getNodes()){
			System.out.println(node.getName());
		}
		
	}

}
