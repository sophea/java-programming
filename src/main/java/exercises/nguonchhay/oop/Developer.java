package exercises.nguonchhay.oop;

import java.util.Date;


public class Developer extends Employee implements View {

	protected String comment;

	public Developer() {}

	public Developer(String comment) {
		setComment(comment);
	}

	public Developer(String lastName, String firstName, Date birthDate, double salary, double years, String comment) {
		super(lastName, firstName, birthDate, salary, years);
		setComment(comment);
	}

	public Developer(long id, String lastName, String firstName, Date birthDate, double salary, double years, Date createdDate,
			Date updatedDate, String createdBy, String updatedBy, long state, long version, String comment) {
		super(id, lastName, firstName, birthDate, salary, years, createdDate, updatedDate, createdBy, updatedBy, state, version);
		setComment(comment);
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getDataView() {
		StringBuffer packedString = new StringBuffer();
		packedString.append("Fullname: ").append(super.getFullnameInUpperCase()).append(super.getLineSeparator());
		packedString.append("Comment: ").append(getComment()).append(super.getLineSeparator());
		packedString.append("Salary: ").append(super.getSalary()).append(super.getLineSeparator());
		return packedString.toString();
	}
}