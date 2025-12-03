package logical_program;

public class Generic {
	
	public static void main (String [] args) {
		
		B <String> b = new B<>();
		b.add("nanda", "kishor");	
	}

}
interface IA <T> {
	
	void add(T t1, T t2);
}
class B <T> implements IA <T>{
	

	
	
	@Override
	public void add(T t1, T t2) {
		
		System.out.println(t1+" "+t1+t2);
	}
	
}