package inheritance;

abstract class Parent4{
	public void m1() {
		System.out.println("Parent class concrete m1()");
	}
	
	public abstract void m2();
}

class Child4 extends Parent4 {
	public void m2() {
		System.out.println("Parent class abstract m2()");
	}
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 obj = new Child4();
		obj.m1();
		obj.m2();
	}

}
