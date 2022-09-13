/**
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
