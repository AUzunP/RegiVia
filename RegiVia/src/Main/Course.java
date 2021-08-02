package Main;

public class Course {

	String className;
	String classCode;
	String startTime;
	String endTime;
	
	public Course(String className, String classCode, String startTime, String endTime) {
		
		this.className = className;
		this.classCode = classCode;
		this.startTime = startTime;
		this.endTime = endTime;
		
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		//00:00 Format
		this.classCode = classCode;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	
}
