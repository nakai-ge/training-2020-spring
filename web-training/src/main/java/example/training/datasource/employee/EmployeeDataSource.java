package example.training.datasource.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepository;

@Repository
public class EmployeeDataSource implements EmployeeRepository {

	@Autowired
	private EmployeeMapper mapper;

//	@Override
//	public Employee findById( Integer employeeId ){
//		Employee employee = new Employee(
//				new EmployeeId(employeeId),
//				new EmployeeName("太郎", "社員"),
//
//				Gender.MALE,
//				new DateOfBirth(LocalDate.of(1983, 6, 14)),
//				new EmployeeDepartment(
//						new DepartmentId(20),
//						new DepartmentName("システム本部")));
//		return employee;
//	}

	@Override
	public Employee findById( Integer employeeId ){
		return mapper.findById(employeeId);
	}

	@Override
	public EmployeeList listOf() {
		List<Employee> list = mapper.listOf();
		if(list == null)
			return new EmployeeList();
		return new EmployeeList(list);
	}
}
