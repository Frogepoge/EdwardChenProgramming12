package com.name.modele3;

public class Circle extends TwoDShape{
    public final double PI=3.1415926;
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*PI;
    }


    public double getRadius(double radius){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }


    @Override
    public String toString() {
        return "radius=" + radius;
    }
    
}
