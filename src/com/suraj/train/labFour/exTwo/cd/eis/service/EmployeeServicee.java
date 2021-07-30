package com.suraj.train.labFour.exTwo.cd.eis.service;

import com.suraj.train.labFour.exTwo.cd.eis.bean.Employee;

public class EmployeeServicee implements EmployeeService{
    private Employee employee;

    public EmployeeServicee() {
    }



    @Override
    public Employee getEmployeeDetails() {
        return this.employee;
    }

    @Override
    public String findInsuranceScheme(double salary, String designation) {
        if(salary<1000 && designation == "clerk"){
            return "non premium Insurance scheme";
        }else {
            return "premium Insurance scheme";
        }
    }

    @Override
    public void setEmployeeDetails(Employee employee) {
        this.employee = employee;
    }
}
