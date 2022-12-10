package Aula01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsList {

	public static void main(String[] args) {
		//List não precisa especificar o tamanho
		List<String> nomes = new ArrayList<>();
		nomes.add("List - Lucas");
		nomes.add("List - Lucas 2");
		nomes.remove(1);
		System.out.println(nomes.get(0));
		
		
		//List não precisa especificar o tamanho, tipo object aceita qualquer tipo.
		List<Object> object = new ArrayList<>();
		object.add("object - Lucas");
		object.add(2);
		object.add(2.5);
		System.out.println(object.get(0));
		
		//ArrayList não precisa especificar o tamanho, usa o array primitivo
		String[] nomesArray = new String[2];
		nomesArray[0] = "Array primitivo - Samila 1";
		nomesArray[1] = "Camila 2";
		System.out.println(nomesArray[0]);
		
		
		//Encadeamento de objetos
		List<String> nomes2 = new LinkedList<>();
		nomes2.add("LinkedList - Camila");
		nomes2.add("Isadora");
		System.out.println(nomes2.get(0));
		
	}

}
