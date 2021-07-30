package com.suraj.train.labFour.exTwo.cd.eis.service;

import com.suraj.train.labFour.exTwo.cd.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    String findInsuranceScheme(double salary,String designation);
    void setEmployeeDetails(Employee employee);
}
