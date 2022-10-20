package midterm;

import java.util.ArrayList;
import java.util.List;

public class SourceFile {

	private int size;
	private String extension;
	private List<String> history;
	
	public SourceFile(int size, String extension) {
		this.size = size;
		this.extension = extension;
		history = new ArrayList<String>();
	}
	
	public void addToHistory(String addition) {
		history.add(addition);
	}
	
	public void display() {
		System.out.println("File size: " + size + " bytes");
		System.out.println("File type: " + extension);
		System.out.println("History: ");
		for (String s : history) {
			System.out.println(s);
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public String getExtension() {
		return extension;
	}
}
