package com.evan.learning;

import com.evan.learning.dao.impl.onetoone.PersonDaoImpl;
import com.evan.learning.model.onetomany.Department;
import com.evan.learning.model.onetomany.Employee;
import com.evan.learning.model.onetoone.Person;
import com.evan.learning.service.impl.onetomany.DepartmentServiceImpl;
import com.evan.learning.service.impl.onetoone.PersonServiceImpl;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        PersonServiceImpl personService = new PersonServiceImpl();
//        Person person = personService.findById(3L);
//        if (person != null) {
//            System.out.println(person.getName());
//        }
//        List<Person> personList = personService.findAll();
//        if (personList != null) {
//            for (Person p : personList){
//                System.out.println(p.getName());
//            }
//        }
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        List<Employee> employeeList = (List<Employee>) departmentService.findAllByDepartmentId(5);
        if (employeeList != null) {
            System.out.println(employeeList);
        }

    }
}
