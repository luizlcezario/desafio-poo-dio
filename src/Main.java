import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitle("Hello World!");
        curso.setDescription("Como printar um Hello World!");
        curso.setHours(1);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Hello World!");
        mentoria.setDescription("Como printar um Hello World!");
        mentoria.setDate(LocalDate.now());
        System.out.println(mentoria);
        System.out.println(curso);
    }
}
