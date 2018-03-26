

public class CourseRevised{
	private String courseName;
	private String[] students = new String [100];
	private int numberOfStudents = 0;
	
	public CourseRevised(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		numberOfStudents++;
		if(students.length < numberOfStudents) {
			String[] studentList = new String[numberOfStudents];
			for(int i = 0; i < students.length; i++) {
				studentList[i] = students[i];
			}
			studentList[numberOfStudents - 1] = student;
		} else 
			students[numberOfStudents - 1] = student;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String[] getStudents() {
		String[] studentList = new String[numberOfStudents];
		for(int i = 0; i < numberOfStudents; i++) {
			studentList[i] = students[i];
		}
		return studentList;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(students[i] == student) {
				for(int j = i; j < numberOfStudents - 1; j++) {
					students[j] = students[j + 1];
				}
				numberOfStudents--;
				break;
			}
		}
	}
	
	public void clear() {
		numberOfStudents = 0;
		for(int i = 0; i < students.length; i ++) {
			students[i] = null;
		}
	}
}
