package Access_1;
import Access_mo.Acc_4;    //import Acc_4 class from another package
public class Impo_4 {
public static void main (String args []) {
	
	Ko k = new Ko();
	k.disp();
	
}
}
class Ko extends Acc_4 {
	public void disp() {   //   Accessing protected members using inheritance

		show();
	}
}