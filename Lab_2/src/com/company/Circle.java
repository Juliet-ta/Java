package com.company;

public class Circle {
    final private float ox;
    final private float oy;
    final private float radius;

    public Circle(float ox, float oy, float radius) {
        this.ox = ox;
        this.oy = oy;
        this.radius = radius;
    }

    public double length(){
        return 2 * Math.PI * this.radius;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public boolean isBelong(double x, double y) {
        boolean Belong = false;
        if ((x - this.ox) * (x - this.ox) + (y - this.oy) * (y - this.oy) <= this.radius) {
            Belong = true;
        }
        return Belong;
    }

    static double EPS = 1e-9;

    public double crossCirclePoints(Circle circle) {
        double x1 = this.ox, x2 = circle.ox, y1 = this.oy, y2 = circle.oy, r1 = this.radius, r2 = circle.radius;
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        if(x1 == x2 && y1 == y2 && r1 == r2)
            return Double.POSITIVE_INFINITY;
        if (distance == r1 + r2 || distance + r2 == r1 || distance + r1 == r2)
            return 1;
        if (distance > r1 + r2)
            return 0;
        if (distance + r2 < r1 || distance + r1 < r2)
            return 0;
        return 2;
    }
}
