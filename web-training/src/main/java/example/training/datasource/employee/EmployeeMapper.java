package example.training.datasource.employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import example.training.model.employee.Employee;

@Mapper
public interface EmployeeMapper {
	Employee findById(@Param( "employeeId" ) Integer employeeId);
}
