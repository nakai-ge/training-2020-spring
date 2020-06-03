package example.training.model.employee.criteria;

public class EmployeeListCriteria {

	private String departmentName;

	public EmployeeListCriteria() {
		departmentName = "";
	}

	public boolean isEmpty() {
		return departmentName.isEmpty();
	}

	public boolean isNotEmpty() {
		return !departmentName.isEmpty();
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [departmentName=%s]", departmentName);
	}
}
