package example.training.model.department;

public class DepartmentId {

	private Integer value;

	public DepartmentId(Integer value) {
		super();
		this.value = value;
	}

	public DepartmentId() {
	}

	public boolean isEmpty() {
		if(value == null)
			return true;
		return false;
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DepartmentId [value=%s]", value);
	}
}
