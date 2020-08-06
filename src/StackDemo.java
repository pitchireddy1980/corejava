
public class StackDemo {

	public static final int MAX=100;
	int top;
	int a[]=new int[MAX];
	
	void push(int x) {
		a[++top]=x;
		System.out.println(x +" pushed into stack");
	}
	
	int pop() {
		int x = a[--top];
		System.out.println( x + " popped from stack");
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo s = new StackDemo();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

	}
}
