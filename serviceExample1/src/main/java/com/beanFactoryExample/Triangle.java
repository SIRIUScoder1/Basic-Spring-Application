package com.beanFactoryExample;

public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void draw() {
        System.out.println(pointA.getX() + " " + pointA.getY());
        System.out.println(pointB.getX() + " " + pointB.getY());
        System.out.println(pointC.getX() + " " + pointC.getY());
    }
}
