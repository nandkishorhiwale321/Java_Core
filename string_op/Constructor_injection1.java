package string_op;

public class Constructor_injection1 {

	public static void main(String[] args) {
		bank cbi = new bank(123654,"Nandkishor Hiwale");
		
		
		cbi.Acc=555555;
		cbi.show();
		
	}

}
class bank{
	  int Acc;
	String Name;
	
	public bank(int Acc, String Name) {
		this.Acc = Acc;
		this.Name = Name;
	}
	public  void show() {
		System.out.println("Account Numer:"+Acc+"\nName:"+Name);
	}
}