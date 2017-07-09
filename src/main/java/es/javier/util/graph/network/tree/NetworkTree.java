package es.javier.util.graph.network.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author javigs82@gmail.com
 * @version 1.0 *
 */
public class NetworkTree {
	public NetworkTree(String name) {
		super();
		this.name = name;
		this.nodes = new ArrayList<>();
		this.mapNodes = new LinkedHashMap<>(); 
	}

	private String name;
	private ArrayList<NetworkNode> nodes;
	private Map<String, ArrayList<NetworkNode>> mapNodes;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nodes
	 */
	public ArrayList<NetworkNode> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes
	 *            the nodes to set
	 */
	public void setNodes(ArrayList<NetworkNode> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @return the mapNodes
	 */
	public Map<String, ArrayList<NetworkNode>> getMapNodes() {
		return mapNodes;
	}

	/**
	 * @param mapNodes the mapNodes to set
	 */
	public void setMapNodes(Map<String, ArrayList<NetworkNode>> mapNodes) {
		this.mapNodes = mapNodes;
	}

}
