package Scope.que2;

public class B {

	C objectofC;

	public C getObjectofC() {
		return objectofC;
	}

	public void setObjectofC(C objectofC) {
		System.out.println("Setting object C in class B...");
		this.objectofC = objectofC;
	}
}
