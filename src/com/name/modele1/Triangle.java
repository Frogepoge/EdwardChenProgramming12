package com.name.modele1;

public class Triangle extends TwoDShape{
    private double side1; // sidea
    private double side2; // Sideb
    private double side3; // Sidec

    // First
    public Triangle(double width, double height) {
        super(width, height);
    }

    // Second, only accept three lengths
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Use heron formula for heigh
    private double heronsHeight() {
        // calculate half
        double s = (side1 + side2 + side3) / 2.0;
        // calculate circumfrence）
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        // Calculate height (based on side 2)
        return (2 * area) / side2;
    }

    // Calculate height using Heron's formula
    public double getHeight() {
        return heronsHeight();
    }

    // Other methods
    public double getSide1(double side1) {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1=side1;
    }

    public double getSide2(double side2) {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2=side2;
    }

    public double getSide3(double side3) {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3=side3;
    }

    @Override
    public String toString() {
        return toString();
    }
}

