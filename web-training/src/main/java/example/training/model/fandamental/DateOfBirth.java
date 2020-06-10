package example.training.model.fandamental;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class DateOfBirth {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate value;

	public DateOfBirth(LocalDate value) {
		super();
		this.value = value;
	}

	public DateOfBirth() {
		super();
	}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DateOfBirth [value=%s]", value);
	}
}
