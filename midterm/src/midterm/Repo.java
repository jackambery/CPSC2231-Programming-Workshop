package midterm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Repo {

	//repoMap is <fileName, sourceFile>
	private Map<String, SourceFile> repoMap;
	
	public Repo() {
		repoMap = new HashMap<String, SourceFile>();
	}
	
	public void add(String filename, int size, String extension) {
		SourceFile sf = new SourceFile(size, extension);
		repoMap.put(filename, sf);
	}
	
	public void remove(String fileName) {
		if (repoMap.containsKey(fileName)) {
			repoMap.remove(fileName);
		}
		else {
			System.out.println("*error* - " + fileName + " was not found in the repo.");
		}
	}
	
	public void remove(int size) {
		Set<String> files = repoMap.keySet();
		Iterator<String> iter = files.iterator();
		while(iter.hasNext()) {
			if (repoMap.get(iter.next()).getSize() < size) {
				iter.remove();
			}
		}
	}
	
	public void modify(String key, String commitMessage) {
		repoMap.get(key).addToHistory(commitMessage);
	}
	
	public void retrieve() {
		System.out.println("All filenames in repo: ");
		Set<String> files = repoMap.keySet();
		for (String fileName : files) {
			System.out.println(fileName);
		}
	}
	
	public void retrieve(String extension) {
		System.out.println("All files in repo of type " + extension + ": ");
		Set<String> files = repoMap.keySet();
		for (String fileName : files) {
			if (repoMap.get(fileName).getExtension().equals(extension)) {
				System.out.println(fileName);
			}
		}
	}
	
	public void display() {
		Set<String> files = repoMap.keySet();
		//needed to create two iterators because I couldn't call iter.next() twice per iteration
		Iterator<String> iter = files.iterator();
		Iterator<String> iter2 = files.iterator();
		while(iter.hasNext()) {
			System.out.println("File: " + iter.next());
			repoMap.get(iter2.next()).display();
			System.out.println("------------");
		}
	}
}
