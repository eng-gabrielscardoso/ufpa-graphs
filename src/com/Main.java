package com;

import java.util.ArrayList;
import java.util.Scanner;

import com.core.Edge;
import com.core.Graph;
import com.core.Vertex;

public class Main {
	public static boolean isRunning = true;
	public static ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	public static ArrayList<Edge> edges = new ArrayList<Edge>();
	public static Graph currentGraph = null;
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			printSaudation();
			System.out.print("Enter your choose: ");
			int option = scan.nextInt();
			
			System.out.println();
			
			switch(option) {
			case 0:
				stop();
				break;
			case 1:
				createGraph();
				break;
			case 2:
				insertEdge();
				break;
			case 3:
				insertEdges();
				break;
			case 4:
				removeEdge();
				break;
			case 5:
				hasEdgeBetween();
				break;
			case 6:
				getAdjacencyMatrix();
				break;
			case 7:
				getAdjacencyList();
				break;
			case 8:
				getTotalVertices();
				break;
			case 9:
				getTotalEdges();
				break;
			case 10:
				getDegrees();
				break;
			case 11:
				getInDegree();
				break;
			case 12:
				getOutDegree();
				break;
			case 13:
				printGraph();
				break;
			}
		} while(isRunning);
	}
	
	public static void printSaudation() {
		System.out.println("# Welcome to TAD Graph");
		System.out.println("## What have you want to do?");
		System.out.println("0 - Finish application");
		System.out.println("1 - Create a new graph");
		System.out.println("2 - Insert an edge");
		System.out.println("3 - Insert a set of edges");
		System.out.println("4 - Remove an edge");
		System.out.println("5 - Check if has an edge between two vertices");
		System.out.println("6 - Get the adjacency matrix");
		System.out.println("7 - Get the adjacency list");
		System.out.println("8 - Get the total number of vertices");
		System.out.println("9 - Get the total number of edges");
		System.out.println("10 - Get the degree of an undirected graph");
		System.out.println("11 - Get the in-degree of an directed graph");
		System.out.println("12 - Get the out-degree of an directed graph");
		System.out.println("13 - Print the current graph");
	}
	
	public static void stop() {
		System.out.println("Bye...");
		isRunning = false;
	}
	
	public static void createGraph() {
		
		
		do {
			System.out.println("## Creating vertices");
			System.out.print("Please insert the label of the vertex: ");
			int label = scan.nextInt();
			System.out.print("Please insert the weight of the vertex (default = 0): ");
			int vertexWeight = scan.nextInt();
			
			Vertex v = new Vertex(label, vertexWeight);
			vertices.add(v);
			
			System.out.print("Have you want to insert one more? (1 - Yes; 2 - No): ");
			int insertAnotherVertex = scan.nextInt();
			if(insertAnotherVertex == 1) {
				continue;
			} else {
				System.out.println("## Linking vertices by edges");
				
				System.out.println("Available vertices: {");
				for(int i = 0; i < vertices.size(); i++) {
					System.out.println(i + " - " + vertices.get(i).toString());
				}
				System.out.println("}");
				
				do {
					System.out.print("Inform the index which vertex parts: ");
					int vertexFromIndex = scan.nextInt();
					System.out.print("Inform the index which vertex arrives: ");
					int vertexToIndex = scan.nextInt();
					System.out.print("Inform the weight of the edge: ");
					int edgeWeight = scan.nextInt();
					
					Vertex vertexFrom = vertices.get(vertexFromIndex);
					Vertex vertexTo = vertices.get(vertexToIndex);
					Edge e = new Edge(vertexFrom, vertexTo, edgeWeight);
					edges.add(e);
					
					System.out.print("Have you want to insert one more? (1 - Yes; 2 - No): ");
					int insertAnotherEdge = scan.nextInt();
					
					if(insertAnotherEdge == 1) {
						continue;
					} else {
						Graph g = new Graph(edges);
						currentGraph = g;
						break;
					}
				} while(true);
				
				break;
			}
		} while(true);
	}
	
	public static void insertEdge() {
		System.out.println("Available vertices: {");
		for(int i = 0; i < vertices.size(); i++) {
			System.out.println(i + " - " + vertices.get(i).toString());
		}
		System.out.println("}");
		
		do {
			System.out.print("Inform the index which vertex parts: ");
			int vertexFromIndex = scan.nextInt();
			System.out.print("Inform the index which vertex arrives: ");
			int vertexToIndex = scan.nextInt();
			System.out.print("Inform the weight of the edge: ");
			int edgeWeight = scan.nextInt();
			
			Vertex vertexFrom = vertices.get(vertexFromIndex);
			Vertex vertexTo = vertices.get(vertexToIndex);
			Edge e = new Edge(vertexFrom, vertexTo, edgeWeight);
			edges.add(e);
			
			System.out.print("Have you want to insert one more? (1 - Yes; 2 - No): ");
			int insertAnotherEdge = scan.nextInt();
			
			if(insertAnotherEdge == 1) {
				continue;
			} else {
				Graph g = new Graph(edges);
				currentGraph = g;
				break;
			}
		} while(true);
	}

	public static void insertEdges() {
		
	}

	public static void removeEdge() {
		System.out.println("Available edges: {");
		for(int i = 0; i < edges.size(); i++) {
			
		}
		System.out.println("}");
	}

	public static void hasEdgeBetween() {
		System.out.println("Available vertices: {");
		for(int i = 0; i < vertices.size(); i++) {
			System.out.println(i + " - " + vertices.get(i).toString());
		}
		System.out.println("}");
		
		System.out.print("Inform the index which vertex parts: ");
		int vertexFromIndex = scan.nextInt();
		System.out.print("Inform the index which vertex arrives: ");
		int vertexToIndex = scan.nextInt();
		
		for(int i = 0; i < edges.size(); i++) {
			if(edges.get(i).getVertexFrom() == vertices.get(vertexFromIndex) && edges.get(i).getVertexTo() == vertices.get(vertexToIndex)) {
				System.out.println("Has a edge between the informed vertices: ");
				System.out.println(edges.get(i).toString());
				return;
			}
		}
		
		System.out.println("There is no edge between the informed vertices");
	}

	public static void getAdjacencyMatrix() {
		
	}

	public static void getAdjacencyList() {
		
	}

	public static void getTotalVertices() {
		System.out.println("Total vertices: " + vertices.size());
	}

	public static void getTotalEdges() {
		System.out.println("Total edges: " + edges.size());
	}

	public static void getDegrees() {
		
	}

	public static void getInDegree() {
		
	}

	public static void getOutDegree() {
		
	}

	public static void printGraph() {
		if(currentGraph == null) {
			System.out.println("It seems that has no graph in memory. Aborting...");
		} else {
			System.out.println("Graph: {");
			for(Edge edge: currentGraph.getEdges()) {
				System.out.println("Edge: " + edge.toString());
			}
			System.out.println("}");
		}
	}
}
