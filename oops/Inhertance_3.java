package oops;

public class Inhertance_3 {

	public static void main(String[] args) {
		
		vaishu w = new vaishu ();               //Hierarchical inheritance
		
		w.Name = "VAISHNAVI DANDAGE";
		w.age = 22;
		w.college ="RSCE";
		
		System.out.println(w.age);
		System.out.println(w.college);
		System.out.println(w.Name);
        w.A();
        
        System.out.println("************************");
        
        harsh r = new harsh ();
        
        r.Name = "HARSH PATIL";
        r.age = 23;
		r.college ="RSCE";
		
        System.out.println(r.age);
		System.out.println(r.college);
		System.out.println(r.Name);
		r.B();
        
        System.out.println("************************");
        
        yash t = new yash ();
        
        t.Name = "YASH ABBAD";
        t.age = 21;
		t.college ="RSCE";
		
        System.out.println(t.age);
		System.out.println(t.college);
		System.out.println(t.Name);
		t.C();
        
        
	}

}
class vaishu {                      //it is parent class
	
	String Name ;
	int age ;
	String college ;
	
	public void A() {
		System.out.println("hello ..... i am vaishu");
		
	}
}
class harsh extends vaishu {      // it is sub class or chaild class of vaishu
	
	public void B() {
		System.out.println("hello...... i am harsh");
	}
}

class yash extends vaishu {             // it is another sub class or chaild class of vaishu
	public void C() {
		System.out.println("hello........i am yash");
	}
	
}
