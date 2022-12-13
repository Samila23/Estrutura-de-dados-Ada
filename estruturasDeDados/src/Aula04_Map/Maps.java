package Aula04_Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		
		map.put("Nome", "Samila");
		map.put("idade", 25);
		
		System.out.println(map.get("Nome"));
		System.out.println(map.entrySet());
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
		}
	}
}
