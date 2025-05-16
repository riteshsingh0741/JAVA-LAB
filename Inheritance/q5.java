package inheritance;


interface First {
	void m1();
	void m2();
}

class Second implements First{
	public void m1() {
		System.out.println("m1....");
	}
	
	public void m2() {
		System.out.println("m2....");
	}
}

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s = new Second();
		s.m1();
		s.m2();
	}

}
