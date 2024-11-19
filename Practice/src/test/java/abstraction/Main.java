package abstraction;

abstract class Car {
	
    abstract public void start();
	abstract public void run();
	 public void musicPlayer() {
	System.out.println("Music is running...............");
}
}

class Tata extends Car { 
	
	public void start() {
		System.out.println("Car is started through key");
	}
	public void run() {
		System.out.println("Car is running");
	}
	
	public void musicPlayer() {
		System.out.println("Music is running");
	}
}

public class Main {
	public static void main(String [] args) {
	Tata nexon=new Tata();
	nexon.start();
	nexon.run();
	nexon.musicPlayer();

	}
}


