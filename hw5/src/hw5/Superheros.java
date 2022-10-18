package hw5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Superheros {
	
	private Map<String, String> heroMap;
	private Set<String> powerSet;
	
	public Superheros() {
		heroMap = new HashMap<String, String>();
		powerSet = new HashSet<String>();
	}
	
	public void putEntryInMap(String key, String value) {
		heroMap.put(key, value);
	}
	
	public String getEntryFromMap(String key) {
		String val = heroMap.get(key);
		return val;
	}
	
	public void removeEntryFromMap(String key) {
		heroMap.remove(key);
		System.out.println(key + " is in the map: " + heroMap.containsKey(key));
	}
	
	public void displayAllMapEntries() {
		Set<String> keys = heroMap.keySet();
	
		for (String key : keys) {
			System.out.println("Hero: " + key);
			System.out.println(" Superpower: " + heroMap.get(key) + "\n");
		}
	}
	
	public void addToSet(String name) {
		powerSet.add(name);
	}
	
	public void removeFromSet(String name) {
		powerSet.remove(name);
	}
	
	public void printSet() {
		for (String power : powerSet) {
			System.out.println("Power: " + power);
		}
	}
	
	

}
