package com.charleskim.assignments.shapes;

public class Rectangle implements Shape {
    private Double length;
    private Double width;
    private Double area;
    
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        this.area = this.length * this.width;
    }

    @Override
    public void display() {
        System.out.printf("The area is %s", this.area);
    }
}
