package com.name.modele3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Triangle(3.0, 4.0, 5.0));
        // Iterate through the list and check the getArea and toString methods
        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString() + " has an area of " + shape.getArea());
        }
    }
    
}
