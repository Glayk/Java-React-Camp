
public class InstructorManager extends UserManager {
	
	public void addCourse(Instructor instructor,String courseName) {
		System.out.println(instructor.userName+" için "+courseName+" kursu eklendi");
		instructor.courseNumber+=1;
	}
}
