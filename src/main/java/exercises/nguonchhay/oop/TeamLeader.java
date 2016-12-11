package exercises.nguonchhay.oop;

import java.util.Date;


public class TeamLeader extends Developer implements View {

	protected int projectNum;

	public TeamLeader() {}

	public TeamLeader(int projectNum) {
		setProjectNum(projectNum);
	}
	
	public TeamLeader(String lastName, String firstName, Date birthDate, double salary, double years, String comment, int projectNum) {
		super(lastName, firstName, birthDate, salary, years, comment);
		setProjectNum(projectNum);
	}

	public int getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	@Override
	public String getDataView() {
		StringBuffer packedString = new StringBuffer();
		packedString.append("Fullname: ").append(super.getFullnameInUpperCase()).append(super.getLineSeparator());
		packedString.append("Number of projects: ").append(getProjectNum()).append(super.getLineSeparator());
		return packedString.toString();
	}
}