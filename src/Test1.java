
class Employee {

	String Name, Address;

	public Employee() {

	}

	public Employee(String Name, String Address) {
		System.out.println("My name is" +  Name);
		System.out.println("My Address is" + Address);

	}
}

public class Test1 {

	public static void main(String[] args) {

		Employee e1 = new Employee("Vijayshree", "Great Britain");
		Employee e2 = new Employee();
	}

}
