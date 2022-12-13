package Aula04_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsAtividade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String chave;
		String valor;
		String menu;
		do {
			System.out.println("Adicione a chave");
			chave = sc.nextLine();
			System.out.println("Adicione o valor");
			valor = sc.nextLine();
			map.put(chave, valor);
			
			System.out.println(" \n Deseja inserir uma nova chave e valor?");
			System.out.println("[1] - SIM");
			System.out.println("[2] - NAO");
			menu = sc.nextLine();
			//sc.nextLine();
			
		} while (!menu.equals("2"));
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
		}
	}

}
