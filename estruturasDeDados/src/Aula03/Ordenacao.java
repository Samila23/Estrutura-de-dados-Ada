package Aula03;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = List.of("Samila","Camila", "Isa","Vivi");
		
		Collections.sort(lista);
		System.out.println(lista);

	}
}

