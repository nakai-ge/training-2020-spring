package example.training.model.employee.criteria;

public class EmployeeListCriteria {

	private Integer selectedDepartmentId;

	public EmployeeListCriteria() {
	}

	public boolean isEmpty() {
		if(selectedDepartmentId == null)
			return true;
		return false;
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

	public Integer getSelectedDepartmentId() {
		return selectedDepartmentId;
	}

	public void setSelectedDepartmentId(Integer selectedDepartmentId) {
		this.selectedDepartmentId = selectedDepartmentId;
	}

	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [selectedDepartmentId=%s]", selectedDepartmentId);
	}
}
