package Scope.que1;

public class A {

	B objectofB;

	public B getObjectofB() {
		return objectofB;
	}

	public void setObjectofB(B objectofB) {
		System.out.println("setting object B in class A...");
		this.objectofB = objectofB;
	}
	
	public String display() {
		return "Inside class A...";
	}
}
