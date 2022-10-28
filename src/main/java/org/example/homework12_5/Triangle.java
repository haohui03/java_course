package org.example.homework12_5;

import java.util.Deque;
import java.util.LinkedList;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        // use deque to test if triangle is legal
        LinkedList<Double> sides = new LinkedList<Double>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        for (int i = 0; i < sides.size(); i++) {
            double s1 = sides.get(0);
            double s2 = sides.get(1);
            double s3 = sides.get(2);
            if (s1+s2<s3){
                throw new IllegalTriangleException(String.valueOf(s1)+"+"+s2+"<"+s3);
            }
            double s=sides.pollFirst();
            sides.add(s);
        }

    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt((p * (p - this.side1) * (p - this.side2) * (p - this.side3)));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
