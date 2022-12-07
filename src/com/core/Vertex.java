package com.core;

public class Vertex {
	private int label, weight = 0;

	public int getLabel() {
		return label;
	}
	
	public void setLabel(int label) {
		this.label = label;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Vertex(int label) {
		this.setLabel(label);
	}
	
	public Vertex(int label, int weight) {
		this.setLabel(label);
		this.setWeight(weight);
	}
	
	@Override
	public String toString() {
		return "Label: " + this.getLabel() + "; Weight: " + this.getWeight();
	}
}
