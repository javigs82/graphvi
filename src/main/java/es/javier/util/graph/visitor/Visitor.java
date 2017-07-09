package es.javier.util.graph.visitor;

import es.javier.util.graph.Graph;
import es.javier.util.graph.Vertex;

/**
 * A graph visitor interface.
 * 
 * @author javigs82@gmail.com
 * @version 1.0
 * @param <T>
 */
public interface Visitor<T> {
  /**
   * Called by the graph traversal methods when a vertex is first visited.
   * 
   * @param g -
   *          the graph
   * @param v -
   *          the vertex being visited.
   */
  public void visit(Graph<T> g, Vertex<T> v);
}