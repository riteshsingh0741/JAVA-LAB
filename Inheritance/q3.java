package inheritance;

class Parent3
{
	int a,b;
	Parent3(int a,int b){
		this.a = a;
		this.b = b;
	}
}

class Child3 extends Parent3
{
	int c,d;
	Child3(int a,int b,int c,int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void details() {
		System.out.println(super.a + " , " + super.b + " , " + this.c + " , " + this.d);
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 obj = new Child3(10,20,30,40);
		obj.details();
	}

}
