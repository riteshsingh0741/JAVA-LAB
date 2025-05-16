package inheritance;

class Parent2
{
	private int a;
	Parent2(int a){
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
}

class Child2 extends Parent2
{
	private int b;
	Child2(int a, int b){
		super(a);
		this.b = b;
	}
	
	public int getB() {
		return this.b;
	}
	
	void details() {
		System.out.println("A and B are : " + super.getA() + " , " + this.getB());
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj = new Child2(10,20);
		obj.details();
	}

}
