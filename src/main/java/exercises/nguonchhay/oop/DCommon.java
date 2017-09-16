package exercises.nguonchhay.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DCommon {
	protected long id;
	protected Date createdDate;
	protected Date updatedDate;
	protected String createdBy;
	protected String updatedBy;
	protected long state;
	protected long version;
	
	public final String lineSeparator = System.lineSeparator();
	public final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMMM/yyyy");

	public DCommon() {}

	public DCommon(long id, Date createdDate, Date updatedDate, String createdBy, String updatedBy, long state, long version) {
		setId(id);
		setCreatedDate(createdDate);
		setUpdatedDate(updatedDate);
		setCreatedBy(createdBy);
		setUpdatedBy(updatedBy);
		setState(state);
		setVersion(version);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getCreateDateString() {
		if (null == createdDate) {
			return "";
		}
		return createdDate.toString();
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDateString() {
		if (null == updatedDate) {
			return "";
		}
		return updatedDate.toString();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getState() {
		return state;
	}

	public void setState(long state) {
		this.state = state;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
	
	public String getLineSeparator() {
		return lineSeparator;
	}
	
	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}
}