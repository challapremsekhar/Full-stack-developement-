package com.yamini.employeemanagement;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

        EmployeeService service = (EmployeeService) factory.getBean("employeeService");

        service.addEmployee(1, "Yamini");
        service.addEmployee(2, "Sai");

        service.displayEmployees();
    }
}