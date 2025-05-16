package inheritance;

class Parent {
	int a;
	Parent(int a){
		this.a = a;
	}
}

class Child extends Parent{
	int b;
	Child(int a,int b){
		super(a);
		this.b = b;
	}
	
	void details() {
		System.out.println(super.a + " , " + this.b);
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child(10,20);
		obj.details();
	}

}
