import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitle("Hello World!");
        curso.setDescription("Como printar um Hello World!");
        curso.setHours(1);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Ajudando a ser javeiro!");
        mentoria.setDescription("Mentoria sobre como fazer cafe tipo java!");
        mentoria.setDate(LocalDate.now());
      
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Ze");
        Dev dev2 = new Dev("Luiz");
        System.out.println("--------------");
        System.out.println("Ze: " + dev1.getConteudosIncritos());
        System.out.println("Luiz: " + dev2.getConteudosIncritos());
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Ze: " + dev1.getConteudosIncritos());
        System.out.println("Luiz: " + dev2.getConteudosIncritos());
        System.out.println("--------------");
        dev1.progredir();
        dev1.progredir();
        dev2.progredir();
        System.out.println("Ze: " + dev1.getConteudosConcluidos());
        System.out.println("Luiz: " + dev2.getConteudosConcluidos());
        System.out.println("--------------");
        System.out.println("XP do Ze: " + dev1.calcularTotalXP());
        System.out.println("XP do Luiz: " + dev2.calcularTotalXP());
   
    }
}
