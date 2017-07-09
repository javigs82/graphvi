package es.javier.util.graph.visitor;

import es.javier.util.graph.Graph;
import es.javier.util.graph.Vertex;

/**
 * A graph visitor interface that can throw an exception during a visit
 * callback.
 * 
 * @author javigs82@gmail.com
 * @version 1.0
 * @param <T>
 * @param <E>
 */
public interface VisitorEX<T, E extends Exception> {
  /**
   * Called by the graph traversal methods when a vertex is first visited.
   * 
   * @param g -
   *          the graph
   * @param v -
   *          the vertex being visited.
   * @throws E
   *           exception for any error
   */
  public void visit(Graph<T> g, Vertex<T> v) throws E;
}