package abstraction;

interface A {
	public void run()  ;
}

interface B{
	public void run()  ;
}

class C implements A,B {
	
	public void run()  {
		System.out.println("Ox is runnug");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		
A runs=new C();
runs.run();
	}

}
