package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class StudentConfiguration {
    @Bean
    @Scope(value="singleton")
    public Student getStudent(){return new Student(name());}

    @Bean
    public String name() {return "Irina";}

    @Bean
    @Scope(value="prototype")
    public Student studentPrototype(){
        Student student = new Student();
        student.setFirstName("IrinaH");
        return student;
    }
}
