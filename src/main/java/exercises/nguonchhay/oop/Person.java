package exercises.nguonchhay.oop;

import java.util.Date;

public class Person extends DCommon {
	protected Date birthDate;
	protected String lastName;
	protected String firstName;

	public Person() {}

	public Person(String lastName, String firstName, Date birthDate) {
		setLastName(lastName);
		setFirstName(firstName);
		setBirthDate(birthDate);
	}

	public Person(long id, String lastName, String firstName, Date birthDate, Date createdDate, Date updatedDate, String createdBy, String updatedBy, long state, long version) {
		super(id, createdDate, updatedDate, createdBy, updatedBy, state, version);
		setLastName(lastName);
		setFirstName(firstName);
		setBirthDate(birthDate);
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullname() {
		return new StringBuffer().append(lastName).append(" ").append(firstName).toString();
	}
	
	public String getFullnameInUpperCase() {
		return getFullname().toUpperCase();
	}

	public String toString() {
		StringBuffer packedString = new StringBuffer();
		packedString.append("Id: ").append(getId()).append(super.getLineSeparator());
		packedString.append("Fullname: ").append(getFullnameInUpperCase()).append(super.getLineSeparator());
		if (getBirthDate() != null) {
			packedString.append("Birth date: ").append(super.getDateFormat().format(getBirthDate())).append(super.getLineSeparator());
		}
		if (getCreatedDate() != null) {
			packedString.append("Created date: ").append(super.getDateFormat().format(super.getCreatedDate())).append(super.getLineSeparator());
		}
		if (getUpdatedDate() != null) {
			packedString.append("Updated date: ").append(super.getDateFormat().format(getUpdatedDate())).append(super.getLineSeparator());
		}
		packedString.append("Created by:").append(super.getCreatedBy()).append(super.getLineSeparator());
		packedString.append("Updated by: ").append(super.getUpdatedBy()).append(super.getLineSeparator());
		packedString.append("State: ").append(super.getState()).append(super.getLineSeparator());
		packedString.append("Version: ").append(super.getVersion()).append(super.getLineSeparator());
		return packedString.toString();
	}
}