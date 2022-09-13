/*
 * Name: Jack Ambery
 * Assignment: hw1
 * Date: 13 September 2022
 * This is the Employee class for hw1.
 * 
 */
package hw1;

public class Employee {
	
	private String name;
	private String title;
	
	public Employee(String n, String t) {
		name = n;
		title = t;
	}
	
	public Employee() {
		name = "";
		title = "";
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setTitle(String t) {
		title = t;
	}
}
