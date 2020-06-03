package example.training.datasource.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeRepository;

@Repository
public class EmployeeDataSource implements EmployeeRepository {

	@Autowired
	private EmployeeMapper mapper;

	@Override
	public Employee findById(Integer employeeId) {
		return mapper.findById(employeeId);
	}

}