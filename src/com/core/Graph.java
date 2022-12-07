package com.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph {
	private ArrayList<Edge> edges = new ArrayList<Edge>();
	private boolean isDirected = false;

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	
	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}
	
	public Graph(ArrayList<Edge> edges) {
		this.setEdges(edges);
	}
	
	public Graph(ArrayList<Edge> edges, boolean isDirected) {
		this.setEdges(edges);
		this.setDirected(isDirected);
	}
	
	public int getTotalVertices() {
		Set<Vertex> vertices = new HashSet<Vertex>();
		
		for(Edge edge: this.getEdges()) {
			vertices.add(edge.getVertexFrom());
			vertices.add(edge.getVertexTo());
		}
		
		return vertices.size();
	}
	
	public int getTotalEdges() {
		return this.getEdges().size();
	}
	
	public void addEdge(Edge edge) {
		this.edges.add(edge);
	}
	
	public void addEdges(ArrayList<Edge> edges) {
		for(Edge edge: edges) {
			this.edges.add(edge);
		}
	}
	
	public void removeEdge(Edge searchedEdge) {
		int index = 0;
		for(Edge edge: this.getEdges()) {
			if(searchedEdge == edge) {
				this.edges.remove(index);
			}
			index++;
		}
	}
	
	public boolean hasEdgeBetween(Vertex vertexFrom, Vertex vertexTo) {
		for(Edge edge: this.getEdges()) {
			if(edge.getVertexFrom() == vertexFrom && edge.getVertexTo() == vertexTo) {
				return true;
			}
		}

		return false;
	}
	
	// TODO: public int getDegree(Vertex vertex)
	// TODO: public int getInDegree(Vertex vertex)
	// TODO: public int getOutDegree(Vertex vertex)
	// TODO: getAdjacencyMatrix()
	// TODO: getAdjacencyList()

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
