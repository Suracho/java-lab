package com.suraj.train.labFour.exTwo.cd.eis.pl;

import com.suraj.train.labFour.exTwo.cd.eis.bean.Employee;
import com.suraj.train.labFour.exTwo.cd.eis.service.EmployeeServicee;

public class EmployeeInsuranceDemo {
    public static void main(String[] args) {
        Employee mango = new Employee(3,"mango",200,"clerk");
        Employee banana = new Employee(4,"banana",1200,"boss");

        EmployeeServicee employeeServiceMango = new EmployeeServicee();
        EmployeeServicee employeeServiceBanana = new EmployeeServicee();

        employeeServiceMango.setEmployeeDetails(mango);
        employeeServiceBanana.setEmployeeDetails(banana);

        mango.setInsuranceScheme(employeeServiceMango.findInsuranceScheme(mango.getSalary(), mango.getDesignation()));
        banana.setInsuranceScheme(employeeServiceBanana.findInsuranceScheme(banana.getSalary(), banana.getDesignation()));

        System.out.println(employeeServiceMango.getEmployeeDetails());
        System.out.println(employeeServiceBanana.getEmployeeDetails());

        System.out.println(mango.getInsuranceScheme());
        System.out.println(banana.getInsuranceScheme());
    }
}
