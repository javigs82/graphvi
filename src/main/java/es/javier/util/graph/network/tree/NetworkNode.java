package es.javier.util.graph.network.tree;

import java.util.ArrayList;

/**
 * @author javigs82@gmail.com
 * @version 1.0
 *
 */
public class NetworkNode {

	private String name;
	private ArrayList<NetworkNode> subnodes;

	public NetworkNode(String name) {
		super();
		this.name = name;
		this.subnodes = new ArrayList<>();
	}

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

}
