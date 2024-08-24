package taskManagementSystem;
import java.util.Date;

public class Task {
	private String title;
	private String description;
	private int priority;
	private Date duedate;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getDuedate() {
		return duedate;
	}
	
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

}