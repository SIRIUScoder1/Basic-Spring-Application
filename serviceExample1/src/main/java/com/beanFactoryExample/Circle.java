package com.beanFactoryExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

public class Circle implements Shape {
    private Point center;

    @Resource(name="point3")
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }


    public void draw() {
        System.out.println("Drawing a circle");
        System.out.println("Circle center is : " + center.getX() + " " + center.getY());
    }
}
