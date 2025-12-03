package java_Basic;

public class demo5 {

	public static void main(String[] args) {
		
		Nandkishor [] students= new Nandkishor[5];




students[0]=new Nandkishor ();
students[0].rollnumber=101;
students[0].name="AZIM ";
students[0].age=23;
students[0].result="Pass";
students[0].Grade='A';



students[1]=new Nandkishor ();
students[1].rollnumber=102;
students[1].name="RAHUL";
students[1].age=22;
students[1].result="Pass";
students[1].Grade='A';



students[2]=new Nandkishor ();
students[2].rollnumber=103;
students[2].name="PRITI ";
students[2].age=20;
students[2].result="Pass";
students[2].Grade='A';



students[3]=new Nandkishor ();
students[3].rollnumber=104;
students[3].name="KARTIK";
students[3].age=23;
students[3].result="Pass";
students[3].Grade='B';

	
	
students[4]=new Nandkishor();
students[4].rollnumber=105;
students[4].name="ANAND ";
students[4].age=22;
students[4].result="Pass";
students[4].Grade='B';



for(int i=0;i<students.length;i++) {
	System.out.println("Student: "+(i+1));
	System.out.println("Roll Number: "+ students[i].rollnumber);
	System.out.println("Name: "+ students[i].name);
	System.out.println("Age: "+ students[i].age);
	System.out.println("Result: "+ students[i].result);
	System.out.println("Grade: "+ students[i].Grade+"\n");
	System.out.println("******************************");
	


}
	}
}
class Nandkishor {
	int rollnumber;
	String name;
	int age;
	String result;
	char Grade;
}














