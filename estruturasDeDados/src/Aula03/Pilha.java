package Aula03;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<>();
		
		//push == .add
		pilha.push("Samila");
		pilha.push("Lucas");
		pilha.push("Camila");
		pilha.push("Isa");
		pilha.push("Vivi");
		
		//peek - ele pega o ultimo e não remove da pilha
		String itemRetirado = pilha.peek();
		System.out.println("\n - Ultimo Item e não removido da ListaEncadeada:" + itemRetirado);
		for(String item : pilha) {
			System.out.println("ListaEncadeada completa:" + item);
		}
		
		
		//poll - ele pega o ultimo e remove da pilha
		
		String itemNãoRetirado = pilha.pop();
		System.out.println("\n - Ultimo Item e removido da ListaEncadeada:" + itemNãoRetirado);
		
		for(String item : pilha) {
			System.out.println("ListaEncadeada completa:" + item);
		}
	}

}
