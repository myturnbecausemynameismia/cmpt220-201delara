

public class CourseRevisedTest {

	public static void main(String[] args) {
		CourseRevised c = new CourseRevised("biology");
		c.addStudent("Student1");
		c.addStudent("Student2");
		c.addStudent("Student3");
		
		c.dropStudent("Student2");
		
		String stu = "";
		
		for (int i = 0; i < c.getStudents().length; i++) {
			stu += c.getStudents()[i] + " ";
		}
		System.out.println(stu);
	}

}
