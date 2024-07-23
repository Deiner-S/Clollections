package Map;

import java.util.*;

public class ExemploSalaDeAula {

	public static void main(String[] args) {
		
		List<Alunos> turma = cadastrarAluno(5,"A");
		
		
		Map<Integer, List<Alunos>> sala = new HashMap<>();
		sala.put(1,turma);
		
		imprimerAlunos(sala.get(1));
		
	}

	
	
	

		
			
		
	

	
	private static void imprimerAlunos(List<Alunos> alunos) {
		
		alunos.forEach(a->System.out.println("Nome: "+a.getNome() + " // Curso: "+a.getCurso() + " // Sala: "+a.getSala() + " // Nota: "+a.getNota() ));
		
		
	}











	/**
	 * </h1>Cadastro de Alunos</h1>
	 * recebe nome da sala e numero de alunos e cria a quantidade de alunos ficticios
	 * 
	 * @param numeroAlunos
	 * @param sala
	 */
	private static List<Alunos> cadastrarAluno(Integer numeroAlunos, String sala) {
		List<Alunos> turma = new ArrayList<>();
		for(int i = 0;i<numeroAlunos;i++) {
			Alunos aluno1 = new Alunos("Aluno "+(i+1), "Back_End_Java", sala, i);
			turma.add(aluno1);
		}
		
		return turma;
	}

}
