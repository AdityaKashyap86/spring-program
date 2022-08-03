package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("application.config.xml");

        Employee emp = (Employee) context.getBean ("employee");
        emp.getId ();;
        emp.getFirstName ();
        emp.getLastName ();
        emp.getEmail ();
        emp.getMobile ();
        emp.getAddress ();

    }
}
