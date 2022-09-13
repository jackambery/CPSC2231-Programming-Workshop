/*
 * Name: Jack Ambery
 * Assignment: hw1
 * Date: 13 September 2022
 * This is the Company class for hw1.
 * 
 */
package hw1;

public class Company {
	
	private Employee[] employees = new Employee[10];
	int position = 0;
	
	public void addEmployee(Employee emp) {
		employees[position] = emp;
		position++;
	}
	
	public int getEmployeeCount() {
		return position;
	}
}
