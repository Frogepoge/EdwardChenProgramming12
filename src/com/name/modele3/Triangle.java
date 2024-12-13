package com.name.modele3;

public class Triangle extends TwoDShape implements Rotate{
    private double side1; // Side length a
    private double side2; // Side length b
    private double side3; // Side length c

    // First
    public Triangle(double width, double height) {
        super(width, height);
    }

    // Second, only take from three side
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Use herons formula for heigh
    private double heronsHeight() {
        // calculate half
        double s = (side1 + side2 + side3) / 2.0;
        // calculate area using herons
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        // calculate height/side2
        return (2 * area) / side2;
    }

    // use herons formula for height
    public double getHeight() {
        return heronsHeight();
    }

    // other methods
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
        return "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void rotate90() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotate90'");
    }

    @Override
    public void rotate180() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotate180'");
    }

    @Override
    public void rotate(double degree) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotate'");
    }
}

