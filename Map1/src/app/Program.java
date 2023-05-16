package app;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "12345678");
		
		cookies.remove("email");
		cookies.put("phone", "12345679");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		
		//retorna nullo pois n existe
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES: ");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
