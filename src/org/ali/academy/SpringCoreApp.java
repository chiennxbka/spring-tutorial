package org.ali.academy;

import org.ali.academy.config.JDBCUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        // tao doi tuong tu application context
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        System.out.println(objA.getMessage());
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld2");
        System.out.println(objB.getMessage());

        Datasource datasource = (Datasource) context.getBean("datasource");
        JDBCUtils.getConnection(datasource.getDriverClassName(), datasource.getUrl(), datasource.getUsername(), datasource.getPassword());

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        // config with java
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        Employee employee = ctx.getBean(Employee.class);
//        System.out.println(employee);
    }
}
