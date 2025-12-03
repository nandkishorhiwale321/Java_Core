package object_class_method;


public class A {

	public static void main(String[] args) {
		SStudent<String> s1 = new SStudent<>();
		s1.add("anda", "101");
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Saaa<String,Integer> s2 = new Saaa<>();
		
		System.out.println(s2.IA("collectionn"));

	}

}
interface ICollage <T> {
	
	void add(T t1,T t2);
}
class SStudent <T> implements ICollage <T> {
	
	public void  add(T t1, T t2 ) {
		System.out.println(t1.toString()+" "+t2.toString());
		
		
	}
	
	
	
}


interface IA <T,V> {
	
	V IA(T  t1);
	
}
class Saaa <T,V> implements IA <String, Integer> {

	@Override
	public Integer IA(String t1) {
		
		return t1.length();
	}
	
}

