package com.charleskim.assignments.shapes;

public class Circle implements Shape {
    private Double radius;
    private Double area;
    
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public void display() {
        System.out.printf("The area is %s", this.area);
    }
}
