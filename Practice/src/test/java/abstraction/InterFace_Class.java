package abstraction;

interface Vehicle {
	public void start();
	public void run();
	public void musicPlayer();
}

class Mahindra implements Vehicle {
	public void start() {
		System.out.println("Car is started successfully.......... ");
	}
	
	public void run() {
		System.out.println("Car is runing.............");
	}
	
	public void musicPlayer() {
		System.out.println("Music is playing................");
	}
}

public class InterFace_Class {
    public static void main(String[] args) {
	Vehicle XUV3XO=new Mahindra();
    XUV3XO.start();
    XUV3XO.run();
    XUV3XO.musicPlayer();
	
}
}
