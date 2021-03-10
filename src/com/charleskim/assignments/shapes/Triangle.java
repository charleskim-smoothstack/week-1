package com.charleskim.assignments.shapes;

public class Triangle implements Shape {
    private Double base;
    private Double height;
    private Double area;
    
    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        this.area = this.base * this.height * 0.5;
    }

    @Override
    public void display() {
        System.out.printf("The area is %s", this.area);
    }
}
