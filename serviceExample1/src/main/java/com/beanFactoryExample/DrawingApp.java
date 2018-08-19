package com.beanFactoryExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String args[]) {
//        Triangle triangle = new Triangle();
        // dependency injection good example

//        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape triangle = (Shape) context.getBean("circle");
        triangle.draw();
        System.out.println(context.getMessage("greetings",null, "Default Greeting", null));
    }
}
