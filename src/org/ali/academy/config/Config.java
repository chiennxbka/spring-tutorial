package org.ali.academy.config;

import org.ali.academy.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("abc");
        employee.setAge(18);
        employee.setAddress("Ha Noi");
        return employee;
    }
}
