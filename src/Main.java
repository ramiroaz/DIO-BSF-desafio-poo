import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
	
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso de JavaScript");
		curso2.setCargaHoraria(16);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("ESta é a mentoria de Java");
		mentoria1.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}
}
