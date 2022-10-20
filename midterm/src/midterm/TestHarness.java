package midterm;

public class TestHarness {

	public static void main(String[] args) {
		
		Repo repo = new Repo();
		
		repo.add("MainFile", 312, ".java");
		repo.add("ClassFile", 45, ".class");
		repo.add("CFile", 877, ".c");
		repo.add("TestHarness", 13, ".java");
		repo.add("PythonFile", 114, ".py");
		
		repo.display();
		
		repo.modify("MainFile", "initial commit");
		repo.modify("MainFile", "added new method");
		repo.modify("MainFile", "refactoered stinky code");
		
		repo.modify("CFile", "initial commit");
		repo.modify("CFile", "lots of errors, need to learn this language more");
		
		repo.modify("TestHarness", "initial commit");
		repo.modify("TestHarness", "more testing...");
		
		repo.modify("PythonFile", "first commit");
		
		System.out.println("committed a bunch of times...");
		repo.display();
		
		repo.retrieve(".java");
		System.out.println();
		repo.retrieve();
		System.out.println();
		
		System.out.println("Removing all files less than 100 bytes...");
		repo.remove(100);
		repo.display();
		System.out.println();
		
		System.out.println("Removing the C file...");
		repo.remove("CFile");
		repo.display();
		
	}

}
