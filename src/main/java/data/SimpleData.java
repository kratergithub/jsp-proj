package data;

import java.util.Arrays;
import java.util.List;

public final class SimpleData {

	private static List<String> users = Arrays.asList("Pepe", "Manolo", "Paco");

	private static List<String> places = Arrays.asList("Madrid", "Barcelona", "Valencia");

	private SimpleData() {
	}

	public static String getFirstUser() {
		return users.get(0);
	}

	public static String getFirstPlace() {
		return places.get(0);
	}
	
	public static String getRandomUser() {		
		int index = (int)(Math.random() * (users.size() + 1));
		return users.get(index);
	}

}
