package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
        Student student = context.getBean("getStudent", Student.class);
        Student student1 = context.getBean("studentPrototype", Student.class);

        System.out.println(student.getFirstName());
        System.out.println(student1.getFirstName());
        context.close();
    }
}