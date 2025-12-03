package Constructor;

public class Collage {
	public static void main (String []args) {
		
		Student s1 = new Student(1,"Rahul Bodade",101,"Pune","Mechnical Engg");
		Student s2 = new Student(2,"Ram Patel",102,"Mumbai","Mechnical Engg");
		Student s3 = new Student(3,"Pratic Kale",103,"Nasik","Mechnical Engg");
		
		
		System.out.println("*****Student Information*****\n");


		s1.Display();
		s2.Display();
		s3.Display();
		
		System.out.println("      THE END\n");

		
	}

}
class Student {
	
	int Sr ;
	String Name;
	int rollNo ;
	String city;
	String dept; 
	
	
	Student(int Sr,String Name, int rollNo, String city, String dept){
        this.Sr=Sr;
		this.Name=Name;
		this.rollNo=rollNo;
		this.city=city;
		this.dept=dept;
		
	}
	
	public void Display() 	{
		
		
		System.out.println("Sr.:"+Sr);	
		System.out.println("Name        :"+Name);
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Depratment  :"+dept);
		System.out.println("City        :"+city);
		System.out.println("      ******\n");

	}
	
}
