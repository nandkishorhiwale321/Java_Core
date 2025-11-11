package oops;

public class Anonymous_Abstract {
	public static void main(String [] args) {
		
		Govt govt = new Govt() {

			@Override
			String fund(String str) {
				System.out.println("State Govt.Provides Funds For Maharashtra Farmers:"+str);			
				return "1.20L Users";
			}

			@Override
			void GovtSchemes() {
				
				System.out.println("PM-KISAN");
			}
			
			public void UserCondidate (){
				System.out.println("Approximately 1.20L farmers in Mh had received benefits under the Pm_KISAN scheme");
				
				
			}
			
			
		}
		;
		System.out.println(govt.fund("3556455812"));
		govt.GovtSchemes();
		govt.UserCondidate();
	}

}
abstract class Govt {
	
	abstract String fund(String str);
	
	abstract void GovtSchemes();
	
	 void UserCondidate() {
		 
	 }
	
	
	
}
