import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descricao mentoria js");
        mentoria2.setData(LocalDate.of(2012,11,21));

        System.out.println(mentoria1);
        System.out.println(mentoria2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devDimitri = new Dev();
        devDimitri.setNome("Dimitri");
        devDimitri.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos de Dimitri:\n\t" + devDimitri.getConteudosInscritos());
        devDimitri.progredir();
        System.out.println("#### Concluindo um curso... ####");
        System.out.println("Conteúdos Concluídos de Dimitri:\n\t" + devDimitri.getConteudosConcluidos());
        System.out.println("XP: " + devDimitri.calcularTotalXp());

        Dev devCatherine = new Dev();
        devCatherine.setNome("Catherine");
        devCatherine.inscreverBootcamp(bootcamp1);
        System.out.println("\n\nConteúdos Inscritos de Catherine:\n\t" + devCatherine.getConteudosInscritos());
        System.out.println("#### Concluindo dois cursor... ####");
        devCatherine.progredir();
        devCatherine.progredir();
        System.out.println("Conteúdos Concluídos de Catherine:\n\t" + devCatherine.getConteudosConcluidos());
        System.out.println("XP: " + devCatherine.calcularTotalXp());

    }
}
