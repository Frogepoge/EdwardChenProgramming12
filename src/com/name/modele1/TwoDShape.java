package com.name.modele1;

public class TwoDShape {
    private double width;
    private double height;

    public TwoDShape(){
    }

    public TwoDShape(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return (this.width * this.height);
    }

    public double getHeight(double height){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getWidth(double width){
        return width;
    }

    public void set(double width){
        this.width=width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

