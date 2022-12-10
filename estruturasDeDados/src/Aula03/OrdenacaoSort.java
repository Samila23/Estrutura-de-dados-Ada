package Aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoSort {

	public static void main(String[] args) {
		//Ordenação de String
		List<String> lista = new ArrayList<String>();
		lista.add("Zênite");
		lista.add("Ângston");
		lista.add("amarelo");
		lista.add("Amasiado");
		lista.add("Zebra");
		lista.add("Banana");
		lista.add("baba");
		lista.add("Babá");
				
		Collections.sort(lista);
		System.out.println(lista);

	}

}
