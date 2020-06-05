package example.training.model.employee.criteria;

import example.training.model.department.DepartmentId;

public class EmployeeListCriteria {

	private DepartmentId selectedDepartmentId;

	public EmployeeListCriteria() {
		this.selectedDepartmentId = new DepartmentId();
	}

	public DepartmentId getSelectedDepartmentId() {
		return selectedDepartmentId;
	}

	public void setSelectedDepartmentId(DepartmentId selectedDepartmentId) {
		this.selectedDepartmentId = selectedDepartmentId;
	}

	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [selectedDepartmentId=%s]", selectedDepartmentId);
	}
}
