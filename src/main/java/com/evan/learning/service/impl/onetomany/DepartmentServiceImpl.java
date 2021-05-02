package com.evan.learning.service.impl.onetomany;

import com.evan.learning.dao.impl.onetomany.DepartmentDaoImpl;
import com.evan.learning.model.onetomany.Employee;
import com.evan.learning.service.onetomany.DepartmentServiceInterface;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentServiceInterface {
    public List<Employee> findAllByDepartmentId(Integer id) {
        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
        departmentDao.openCurrentSession();
        List<Employee> employeeList = departmentDao.findAllByDepartmentId(id);

        departmentDao.closeCurrentSession();
        return employeeList;
    }
}
