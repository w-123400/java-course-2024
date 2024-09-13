package org.ethz.day3;

public class Node {
    // Private data fields
    private double x;
    private double y;
    private String id;
    
    // Constructor
    public Node(String id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
    // Getter for x coordinate
    public double getX() {
        return x;
    }
    
    // Getter for y coordinate
    public double getY() {
        return y;
    }
    
    // Getter for id
    public String getId() {
        return id;
    }
}

