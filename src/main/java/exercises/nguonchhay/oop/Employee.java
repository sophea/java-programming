package exercises.nguonchhay.oop;

import java.util.Date;

public class Employee extends Person implements View {

	protected double salary;
	protected double years;

	public Employee() {}

	public Employee(double salary, double years) {
		setSalary(salary);
		setYears(years);
	}

	public Employee(String lastName, String firstName, Date birthDate, double salary, double years) {
		super(lastName, firstName, birthDate);
		setSalary(salary);
		setYears(years);
	}

	public Employee(long id, String lastName, String firstName, Date birthDate, double salary, double years, Date createdDate,
			Date updatedDate, String createdBy, String updatedBy, long state, long version) {
		super(id, lastName, firstName, birthDate, createdDate, updatedDate, createdBy, updatedBy, state, version);
		setSalary(salary);
		setYears(years);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	@Override
	public String getDataView() {
		StringBuffer packedString = new StringBuffer();
		packedString.append(super.toString()).append(super.getLineSeparator());
		packedString.append("Salary: ").append(getSalary()).append(super.getLineSeparator());
		packedString.append("Years: ").append(getYears()).append(super.getLineSeparator());
		return packedString.toString();
	}
}