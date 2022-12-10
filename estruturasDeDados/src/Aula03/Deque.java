package Aula03;

import java.util.LinkedList;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Deque<String> fila = new LinkedList<>();
		
		fila.addFirst("Samila");
		fila.addLast("Camila");
		fila.addFirst("Isa");
		fila.addLast("Vivi");
		
		//Retorna o ultimo e não remove
		String itemRetirado = fila.getLast();
		System.out.println("\n - Ultimo Item e não removido da ListaEncadeada:" + itemRetirado);
		for(String item : fila) {
			System.out.println("ListaEncadeada completa:" + item);
		}
		
		//Retorna o primeiro e não remove
		String itemRetirado2 = fila.peekFirst();
		System.out.println("\n - Primeiro Item e não removido da ListaEncadeada:" + itemRetirado2);
		for(String item : fila) {
			System.out.println("ListaEncadeada completa:" + item);
		}
		
		//Retorna o primeiro e remove
		String itemRetirado3 = fila.pollFirst();
		System.out.println("\n - Primeiro Item e não removido da ListaEncadeada:" + itemRetirado3);
		for(String item : fila) {
			System.out.println("ListaEncadeada completa:" + item);
		}
		
	}

}
