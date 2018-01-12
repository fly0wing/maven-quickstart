package org.katas;

import lombok.Getter;

@Getter
public class Circular implements Shape {

    private double r;

    public Circular(double r) {
        this.r = r;
    }

    public double calcArea() {
        return r * r * Math.PI;
    }
}
