package es.javier.util.graph.visitor;

import es.javier.util.graph.Edge;
import es.javier.util.graph.Graph;
import es.javier.util.graph.Vertex;

/**
 * A spanning tree visitor callback interface
 * 
 * @see Graph#dfsSpanningTree(Vertex, DFSVisitor)
 * 
 * @author javigs82@gmail.com
 * @version 1.0
 * @param <T>
 */
public interface DFSVisitor<T> extends Visitor<T>{
  /**
   * Called by the graph traversal methods when a vertex is first visited.
   * 
   * @param g -
   *          the graph
   * @param v -
   *          the vertex being visited.
   */
  //public void visit(Graph<T> g, Vertex<T> v);

  /**
   * Used dfsSpanningTree to notify the visitor of each outgoing edge to an
   * unvisited vertex.
   * 
   * @param g -
   *          the graph
   * @param v -
   *          the vertex being visited
   * @param e -
   *          the outgoing edge from v
   */
  public void visit(Graph<T> g, Vertex<T> v, Edge<T> e);
}