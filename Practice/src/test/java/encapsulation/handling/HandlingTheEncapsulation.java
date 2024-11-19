package encapsulation.handling;

public class HandlingTheEncapsulation {

	private String name;
	private int age;
	private int roll_no;
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int getroll_no() {
		return roll_no;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public void setroll_no(int roll_no) {
		this.roll_no=roll_no;
	}
	
	public static void main(String[] args) {
		HandlingTheEncapsulation hte=new HandlingTheEncapsulation();
		hte.setname("Prashant");
		hte.setage(20);
		hte.setroll_no(123);
		System.out.println(hte.getname());
		System.out.println(hte.getage());
		System.out.println(hte.getroll_no());

	}

}
