package AutoWiring;

public class Employee {

	Department dept;
	Address add;
	
	
	
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", add=" + add + "]";
	}
	
	
	// using constructor
//	public Employee(Department dept, Address add) {
//		super();
//		this.dept = dept;
//		this.add = add;
//	}


	// using getter and setter
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	
}
