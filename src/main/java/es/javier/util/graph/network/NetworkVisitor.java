/**
 * 
 */
package es.javier.util.graph.network;

import java.util.ArrayList;

import es.javier.util.graph.Edge;
import es.javier.util.graph.Graph;
import es.javier.util.graph.Vertex;
import es.javier.util.graph.network.tree.NetworkNode;
import es.javier.util.graph.network.tree.NetworkTree;
import es.javier.util.graph.visitor.DFSVisitor;

/**
 * @author javigs82@gmail.com
 * @version 1.0
 *
 */
// @TODO: add java doc
public class NetworkVisitor implements DFSVisitor<Station> {

	public NetworkVisitor() {
		super();
		this.tree = new NetworkTree("Network Tree");
	}

	private NetworkTree tree;

	/**
	 * @return the tree
	 */
	public NetworkTree getTree() {
		return tree;
	}

	/**
	 * @param tree the tree to set
	 */
	public void setTree(NetworkTree tree) {
		this.tree = tree;
	}

	@Override
	// TODO: implements
	public void visit(Graph<Station> g, Vertex<Station> v) {
		//tree.getNodes().add(new NetworkNode(v.getName()));
	}

	@Override
	// TODO: implements
	public void visit(Graph<Station> g, Vertex<Station> v, Edge<Station> e) {
		tree.getNodes().add(new NetworkNode(v.getName()));

	}

}
