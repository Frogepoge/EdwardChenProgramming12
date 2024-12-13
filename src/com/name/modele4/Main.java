package com.name.modele4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //　create dynamic list object
        List<TwoDShape> shapes = new ArrayList<>();
        //　add test object
        shapes.add(new Circle(5.0,Colour.BLUE));
        shapes.add(new Triangle(3.0, 4.0, 5.0,Colour.BLUE));
        Triangle test1= new Triangle(3.0, 4.0, 5.0,Colour.BLUE);
        test1.rotate90();
        // go through list to get Tostring and getArea methods
        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString() + " has an area of " + shape.getArea());
        }
    }
    
}
