package org.ali.academy;

import org.ali.academy.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApp {

    @Autowired
    Employee employee;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        System.out.println(objA.getMessage());
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(objB.getMessage());

        // config with java
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        Employee employee = ctx.getBean(Employee.class);
//        System.out.println(employee);
    }
}
