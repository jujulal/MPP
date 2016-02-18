/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Prob7.Prob7B;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, String, List<String>> FILTER_BY_SALARY_AND_LASTNAME = (list,
            salary, lastNameFilter) -> list.stream().filter(emp -> emp.getSalary() > salary)
            .filter(emp -> emp.getLastName().toUpperCase().matches(lastNameFilter)).map(emp -> emp.getFirstName() + " " + emp.getLastName()).sorted()
            .collect(Collectors.toList());
}
