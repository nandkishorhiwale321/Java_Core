
public class User_Info_BWC {
	
	public static void  main ( String [] args) {
		
		
		
		
		User user = new User();
		
		user.setName("John");
		
		user.setAge(22);
		
		System.out.println("Name:"+user.getName());
		
		System.out.println("Age:"+user.getAge());
		
		System.out.println(user.getUserInfo());
	}
}
		
 class User {
	
	 String Name;
	
	int Age;
	
	
	
	// String show(String Name, int Age); 
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	public String getUserInfo() {
		
		return Name+"("+Age+")";
	}
	
	
}
 
