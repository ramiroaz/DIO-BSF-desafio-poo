import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
		mentoria1.setDescricao("ESta � a mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		//Conteudo conteudo = new Curso();  //polimorfismo
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);

	
		//criado o bootcamp
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descri��o do Bootcamp JAva Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		//criando os Devs
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		
		//inscrever no bootcamp
		devCamila.inscreverBootcamp(bootcamp1);
		devJoao.inscreverBootcamp(bootcamp1);
		
		//concluir um conteudo
		devJoao.progredir();
		
		//mostra os conteudos dos Devs
		System.out.println("Conte�dos inscritos de Camila : " + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos inscritos de Jo�o   : " + devJoao.getConteudosInscritos());
		
		//mostra os conteudos concluidos
		System.out.println("Conte�dos conclu�dos de Camila : " + devCamila.getConteudosConcluidos());
		System.out.println("Conte�dos conclu�dos de Jo�o   : " + devJoao.getConteudosConcluidos());
		
		//mostra os XP
		System.out.println("XP de Camila : " + devCamila.calcularTotalXp());
		System.out.println("XP de Jo�o : " + devJoao.calcularTotalXp());
	}
}
