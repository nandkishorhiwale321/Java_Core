package java_Basic;
import java.util.Scanner;   
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter distance (in km):");
        double distance = sc.nextDouble(); 
        
        System.out.println("Enter speed (in km/h):");
        double Speed = sc.nextDouble();
        if(Speed <= 0) {
        	System.out.print("T25his is not for you");
        	
        }
        else {
        	double Time = distance / Speed;
        	System.out.print("Time req.." + Time +"hours");
        }
        
       

        sc.close(); 
    }
}
