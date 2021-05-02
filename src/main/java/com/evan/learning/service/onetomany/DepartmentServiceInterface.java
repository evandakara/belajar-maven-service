package com.evan.learning.service.onetomany;

import com.evan.learning.model.onetomany.Employee;

import java.util.List;

public interface DepartmentServiceInterface {
   public List<Employee> findAllByDepartmentId(Integer id);
}
