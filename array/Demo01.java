package array;

public class Demo01 {

	public static void main(String[] args) {
		
		second student1=new second();
		
		second student2=new second();
		
		
		student1.roll_number=101;
		student1.name="samadhan";
		student1.age=21;
		
		student2.roll_number=102;
		student2.name="anand";
		student2.age=22;
		
		
		
	
		
		
		
		
		System.out.println("Student1 :\n Roll Number:"+student1.roll_number+"," +"\n Name:"+ student1.name+"," +"\n Age:"+student1.age+","+"\n");
		
		System.out.println("********************************")
		;
		System.out.println("\nStudent2 :\n Roll Number:"+student2.roll_number+"," +"\n Name:"+ student2.name+"," +"\n Age:"+student2.age+",");
	}
}
		
class second {
int age;
String name;
int roll_number;

	}



