package example.training.model.employee;

public interface EmployeeRepository {

	public Employee findById( Integer employeeId );

	public EmployeeList listOf();

}
