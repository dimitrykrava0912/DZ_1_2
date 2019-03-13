package com.company;

public class Triangle {
    private double side_a;
    private double side_b;
    private double side_c;
    private double square;

    Triangle(double side_a, double side_b, double side_c)
    {
        setSide_a(side_a);
        setSide_b(side_b);
        setSide_c(side_c);
        setSquare();
    }

    public double getSide_a() {
        return side_a;
    }

    private void setSide_a(double side_a) {
        this.side_a = side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    private void setSide_b(double side_b) {
        this.side_b = side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    private void setSide_c(double side_c) {
        this.side_c = side_c;
    }

    public double getSquare() {
        return square;
    }

    private void setSquare() {
        double halfPerim=getHalfPerimeter();
        this.square =Math.sqrt(halfPerim*(halfPerim-side_a)*(halfPerim-side_b)*(halfPerim-side_c)) ;
    }

    private double getHalfPerimeter(){
        return (this.side_a+this.side_b+this.side_c)/2;
    }
}
