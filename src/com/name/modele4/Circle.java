package com.name.modele4;

public class Circle extends TwoDShape{
    public final double PI=3.1415926;
    private double radius;

    // construct function
    public Circle(double radius,Colour colour){
        super(colour);
        this.radius=radius;
    }

    // calculate circle circumfrence
    @Override
    public double getArea() {
        return this.radius*this.radius*PI;
    }

    // Radius
    public double getRadius(double radius){
        return radius;
    }

    // Set Radius 
    public void setRadius(double radius){
        this.radius=radius;
    }


    @Override
    public String toString() {
        return "radius=" + radius +" colour="+colour;
    }
    
}
