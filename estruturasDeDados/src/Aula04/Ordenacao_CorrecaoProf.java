package Aula04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenacao_CorrecaoProf {

	public static void main(String[] args) {
		//Ordem crescente
		List<String> lista = new ArrayList<>(List.of("Vivi", "Samila","Camila", "Isa"));
		lista.sort((a,b) -> a.compareTo(b));
		System.out.println(lista);
		//Ordem decrescente
		lista.sort((a,b) -> b.compareTo(a));
		System.out.println(lista);
		
		List<Aluno> alunos= new ArrayList<>(List.of(
				new Aluno("Samila", "9015"),
				new Aluno("Samila", "8545"),
				new Aluno("Camila", "2654"),
				new Aluno("Isa", "1587"),
				new Aluno("Michele", "8749"),
				new Aluno("Leticia", "3228")
				));
		alunos.sort((a,b) -> a.compareTo(b));
		System.out.println(alunos);
		
		Comparator<Aluno> alunoComparator = Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getMatricula);
		alunos.sort(alunoComparator);
		System.out.println("\n Lista usando o Comparator: \n " + alunos);
	}
}

