package java_Basic;

public class Constructor_Injection {

	public static void main(String[] args) {

		Constructor A = new Constructor(22);
		Constructor.cong B = A.new cong("PRATHMESH",A);
		A.show(B);
	}

}
class Constructor {
	
	int id;
	
	
	public Constructor(int id) {
		this.id = id;
	}
	
	class cong{
	
		String name;
		Constructor demo;
		public cong(String name, Constructor demo) {
			this.name = name;
			this.demo  = demo;
		}
		
	}
	
	public void show(cong obj) {
		System.out.println("Name:"+obj.name+"\n"+"ID:"+obj.demo.id);
	}
	
}