package example.training.service;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;

public interface EmployeeService {

	public Employee findById(Integer employeeId);

	public EmployeeList listOf();
}
