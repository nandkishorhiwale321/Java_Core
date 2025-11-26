package object_class_method;

public class Third {
	public static void main (String [] args) {
		
		Student s =new Student(101, "Ram");
		Student s2 = new Student(101,"Ram");
		
		System.out.println(s.equals(s2));
		
	}

}
class Student {
	
	int id;
	String name;
	
	protected Student(int id,String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
	public boolean equals (Object obj) {
		
		Student stud = (Student)obj;
		return this.id==stud.id && this.name.equals(stud.name);
	}
}
