
public class Main {

	public static void main(String[] args) {
			
		Instructor instructor1=new Instructor();
		instructor1.userName="Engin";
		
		Student student1=new Student();
		student1.userName="Gül";
		student1.commentNumber=20;
		student1.adress="sdkf";
		
		UserManager usermanager=new UserManager();
		usermanager.add(student1);
		usermanager.add(instructor1);
		
		InstructorManager iManager=new InstructorManager();
		iManager.addCourse(instructor1,"python");
		iManager.addCourse(instructor1,"c++");
		
		System.out.println(instructor1.userName+" kurs sayısı :"+instructor1.getCourseNumber());
		
		StudentManager sManager=new StudentManager();
		sManager.addAddress(student1);
	}

}
