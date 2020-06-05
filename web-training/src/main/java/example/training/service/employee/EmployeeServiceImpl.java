package example.training.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepository;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.fandamental.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee findById(Integer employeeId) {
		Employee employee = employeeRepository.findById(employeeId);
		if(employee == null)
			throw new ResourceNotFoundException();
		return employee;
	}

	@Override
	public EmployeeList listOf() {
		return employeeRepository.listOf();
	}

	public EmployeeList listOf(EmployeeListCriteria criteria) {
		return employeeRepository.listOf(criteria);
	}
}
