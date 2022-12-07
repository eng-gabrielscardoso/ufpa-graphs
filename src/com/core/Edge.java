package com.core;

public class Edge {
	private Vertex vertexFrom, vertexTo;
	private int weight = 0;

	public Vertex getVertexFrom() {
		return vertexFrom;
	}

	public void setVertexFrom(Vertex vertexFrom) {
		this.vertexFrom = vertexFrom;
	}

	public Vertex getVertexTo() {
		return vertexTo;
	}

	public void setVertexTo(Vertex vertexTo) {
		this.vertexTo = vertexTo;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Edge(Vertex vertexFrom, Vertex vertexTo) {
		this.setVertexTo(vertexTo);
		this.setVertexFrom(vertexFrom);
	}
	
	public Edge(Vertex vertexFrom, Vertex vertexTo, int weight) {
		this.setVertexTo(vertexTo);
		this.setVertexFrom(vertexFrom);
		this.setWeight(weight);
	}

	@Override
	public String toString() {
		return "[(Vertex from: " + this.getVertexFrom().toString() + "); (Vertex to: " + this.getVertexTo().toString() + ")]; Weight: " + this.getWeight(); 
	}
}
