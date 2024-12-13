package com.name.modele4;

public abstract class TwoDShape {
    private double width;
    private double height;
    protected Colour colour;

    //　Create first 
    public TwoDShape(Colour colour) {
        this.colour = colour;
    }

    //　Create Second
    public TwoDShape(double width, double height){
        this.width=width;
        this.height=height;
    }

    //　Abstrat getArea method
    public abstract double getArea();

    public double getHeight(double height){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getWidth(double width){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    @Override
    public String toString() {
        return "width=" + width + ", height=" + height+ ", colour="+colour;
    }
}

