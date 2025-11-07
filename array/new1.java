package array;

public class new1 {

	public static void main(String[] args) {
		
		College student1=new College();
		
		College student2=new College();
		
		
		student1.roll_number=101;
		student1.name="samadhan";
		student1.age=21;
		
		student2.roll_number=102;
		student2.name="anand";
		student2.age=22;
		
		
		
		
		
		
		System.out.println("Student1 :"+student1.roll_number+"\n" + student1.name  + student1.age);
	}
}
		
class College {
int age;
String name;
int roll_number;

	}



