package com.springboot.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee("Muni",4000),
                new Employee("Rathnam",5000),
                new Employee("Raj",6000)
        );
        List<Employee> sortedList=employeeList.stream()
                .sorted(Comparator
                        .comparingDouble(Employee::getSalary).reversed())
                .distinct()
                .collect(Collectors.toList());

        if(sortedList.size()<2){
            System.out.println("Not an unique determine second highest salary");
        }
        else{

            Employee secondHighest=sortedList.get(1);

            System.out.println("Second highest salary" + secondHighest);
        }
    }
}
