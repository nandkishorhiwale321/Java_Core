package oops;

public class InheritnceType {
	
	public static void main (String [] args) {
		
      
        bike b = new bike();
        b.singleLevel();
        b.start();
        b.stop();

        System.out.println("---------------");

        Caar c = new Caar();
        c.setType("Hierarchical Inheritance");
        c.wheel();

        Thar t = new Thar();
        t.start();
        t.company("Mahindra Thar");

        Scarpio s = new Scarpio();
        s.company("Mahindra Scarpio-N");
    }
}

class veahicle {

    public void start() {
        System.out.println("Vehicle Starting...");
    }

    void stop() {
        System.out.println("Vehicle Stopped.");
    }
}

class bike extends veahicle {

    void singleLevel() {
        System.out.println("This is Single Level Inheritance.");
    }
}

class Caar extends veahicle {

    String type;

    void setType(String str) {
        this.type = str;
        System.out.println("Car Type: " + type);
    }

    void wheel() {
        System.out.println("I have four wheels.");
    }
}

class Thar extends Caar {

    String carName;

    void company(String str) {
        this.carName = str;
        System.out.println("Car Name: " + carName);
    }
}

class Scarpio extends Thar {

    
    void company(String str) {
        this.carName = str;
        System.out.println("Car Name: " + carName);
    }
}
