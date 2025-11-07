package oops;

public class Encapsulation {
	public static void main (String args []) {
		A a = new A();
		a.setName("MAME:PRATHMESH PATEL");
		System.out.println(a.getName());
		
		a.setCollage("VBKCOE");
		System.out.println(a.getCollage());
		
		a.setId(101);
		System.out.println(a.getId());
		
		a.setAddress("MALKAPUR");
		System.out.println(a.getAddress());
		
		System.out.println("********************************************************");
		
		B b  =new B ();
		b.setName("MAME:RAHUL SINGH");
		System.out.println(b.getName());
		
		b.setCollage("COEP");
		System.out.println(b.getCollage());
		
		b.setId(105);
		System.out.println(b.getId());
		
		b.setAdd("PUNE");
		System.out.println(b.getAdd());
	}

}
class A  {
	
	private String name;
	private String collage;
	private int id;
	private String address;
	
	 public void setName(String str) {
		 this.name = str;
	 }

	 
	 public String getName() {
		 return name;
	 }
	  public void setCollage(String str1) {
		  this.collage = str1;
	  }
	  public String getCollage() {
		  return collage;
	  }
	  public void setId(int i) {
		  this.id = i;
	  }
	  public int getId() {
		  return id;
	  }
	  public void setAddress(String str2) {
		  this.address = str2;
		  
	  }
	  public String getAddress() {
		  return address;
	  }
}
class B {
	private String name;
	private String collage ;
	private int id;
	private String add;
	
	public void setName(String str) {
		this.name = str;
	}
	public String getName() {
		return name;
	}
	
	public void setCollage(String str1) {
		this.collage = str1;
		
	}
	public String getCollage() {
		return collage;
	}
	public void setId(int i) {
		this.id = i;
	}
	public int getId() {
		return id;
	}
	public void setAdd(String str2) {
		this.add = str2;
	}
	public String getAdd() {
		return add;
	}

	
}
