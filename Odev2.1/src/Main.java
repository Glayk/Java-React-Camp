
public class Main {

	public static void main(String[] args) {
		Course course1=new Course("C#",30,"Engin Demirog");
		Course course2=new Course("Java",28,"Engin Demirog");
		Course course3=new Course("Programlamaya Giriþ",0,"Engin Demirog");
		
		Course[] courses= {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name+" "+course.completition);
		}
		
		Category category1=new Category("Programlama");
		Category[] categories= {category1};
		for(Category category:categories) {
			System.out.println(category.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.cancelCourse(course2);
 	}

}
