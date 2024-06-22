package member;

public class MainClass {
	
	public static void main(String args[]) {

		Employee emp = new Employee("Isha", "9097809090", "Ahmedabad",25,68000,"JAVA");
		Manager m = new Manager("Riya", "7567770023", "Rajokt", 23,125000,"Web Development");
		
		System.out.println(emp);
		System.out.println(m);
	}
}
