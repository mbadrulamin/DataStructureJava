package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 46));
        employeeList.add(new Employee("Mary", "Kay", 23));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
