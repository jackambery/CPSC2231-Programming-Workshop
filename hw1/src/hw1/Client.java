/*
 * Name: Jack Ambery
 * Assignment: hw1
 * Date: 13 September 2022
 * This is the main class for hw1.
 * 
 */
package hw1;

public class Client {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setName("Jack");
		e1.setTitle("CEO");
		
		e2.setName("Joe");
		e2.setTitle("CFO");
		
		e3.setName("Emily");
		e3.setTitle("Janitor");
		
		Company c = new Company();
		c.addEmployee(e1);
		c.addEmployee(e2);
		c.addEmployee(e3);
		
		int count = c.getEmployeeCount();
		
		System.out.println(count);
	}

}
