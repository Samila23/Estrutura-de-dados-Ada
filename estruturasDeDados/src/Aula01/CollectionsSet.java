package Aula01;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		// Não tem posição, pra remover algum item deve digitar o exato valor do item, não duplica valores iguais.
		Set<String> set = new HashSet<String>();
		set.add("Samila");
		set.add("Camila");
		set.remove("Camila");
		set.add("Camila");
		set.add("Isadora");
		set.add("Isadora");
		set.add("Lucas");
		for(String item : set) {
			System.out.println(item);
		}
		
		Set<String> set2 = new HashSet<String>();
		set2.addAll(set);
		System.out.println(set2);
	}

}
