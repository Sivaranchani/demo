package collection;
import java.util.*;
 class Student{
	 String name;
	 int id;
	  
	 Student(String name, int id){
		 this.name = name;
		 this.id = id;
		 
	 }
	 @Override
 public String toString()
 {
	 return "Student{name='"+ name+ "', id="+id+'}';
	
 }
	 
}
 
	public class StudentManager{
		private List<Student> arrayList;
		private List<Student> linkedList;
		
		public StudentManager() {
			arrayList = new ArrayList<>();
			linkedList = new LinkedList<>();
			
		}
		
		 public void addStudent(Student student) {
			 arrayList.add(student);
			 linkedList.add(student);
		 }
		 public Student findStudent(int id) {
		 for (Student student : arrayList) {
			 if (student.id == id) {
				 return student;
				 
			 }
		 }
		 return null;
	}
	
		 public boolean removeStudent(int id) {
			 Student studentToRemove = findStudent(id);
			 if (studentToRemove!=null) {
				 arrayList.remove(studentToRemove);
				 linkedList.remove(studentToRemove);
				 return true;
				 
			 }
			 return false;
			 
		 }

		 public void printAllStudents() {
			 System.out.println("ArrayList:");
			 for (Student student: arrayList) {
				 System.out.println(student);
				 
			 }
		System.out.println("LinkedList:");
		for (Student student : arrayList) {
			System.out.println(student);
			
		}
		 
		 }
		 
		 public static void main( String[] args) {
			 StudentManager manager = new StudentManager();
			 
			 //add students
			 manager.addStudent(new Student("kowshika",001));
			 manager.addStudent(new Student("sugitha",002));
			 
			 manager.printAllStudents();
			 
			 //find a student
			 Student foundStudent = manager.findStudent(001);
			 System.out.println("foundStudent: "+ foundStudent);
			 
			 // remove a student
			 boolean removed= manager.removeStudent(001);
			 System.out.println("Student removed:" + removed);
			 
			 // print all students after removal
			 manager.printAllStudents();
			 
			 
			 
		 }
	 }
