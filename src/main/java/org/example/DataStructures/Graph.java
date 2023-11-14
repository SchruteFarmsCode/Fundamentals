package org.example.DataStructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public void addVetex(int vertex) {
        adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }
}
