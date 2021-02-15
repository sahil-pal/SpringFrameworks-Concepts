package AutoWiring;

public class Department {
	
	int dept_number;
	String dept_manager;
	
	public int getDept_number() {
		return dept_number;
	}
	public void setDept_number(int dept_number) {
		this.dept_number = dept_number;
	}
	public String getDept_manager() {
		return dept_manager;
	}
	public void setDept_manager(String dept_manager) {
		this.dept_manager = dept_manager;
	}
	
	@Override
	public String toString() {
		return "Department [dept_number=" + dept_number + ", dept_manager=" + dept_manager + "]";
	}
	
	
	
	
}
