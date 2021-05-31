
class Member{
	String name;
	int Age;
	String Phone_no;
	String Address;
	float salary;
	
	public void printSalary() {
		System.out.println("Salary of member is "+salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class Q2 {
public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.name = "Gideon Nti";
		obj1.Age = 26;
		obj1.Phone_no ="0555285176";
		obj1.Address = "Santasi";
		obj1.salary = 2500.50f;
		obj1.specialization = "Major";
		
		Manager obj2 = new Manager();
		obj2.name = "Dorothy Boateng";
		obj2.Age = 29;
		obj2.Phone_no ="0548788886";
		obj2.Address = "Atasemanso";
		obj2.salary = 3500.50f;
		obj2.department = "Physical Sciences";
		
	}

}
