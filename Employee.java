package org.college;

public class Employee {
	static Employee object;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private  Employee getobject() {
		// TODO Auto-generated method stub
if (object==null) {
	
	System.out.println(System.identityHashCode(object));
	 object = new Employee();
	
	System.out.println(System.identityHashCode(object));
	
	
}
	
	return object;
	
		
	}	
	private void empID() {
		// TODO Auto-generated method stub
System.out.println("1234");


	}
	public static void main(String[] args) {
		Employee object= new Employee();
		System.out.println(System.identityHashCode(object));
		
	}
	 {
		//Employee object = new Employee();
	}

}
