import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java js");
        curso2.setDescricao("descricao curso java");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDebora = new Dev();
        devDebora.SetNome ("Debora");
        devDebora.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Debora" + devDebora.getConteudosIncritos());
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Debora" + devDebora.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Debora" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devDebora.calcularTotalXp());

        System.out.println("-------------");

        Dev devJunior = new Dev();
        devDebora.SetNome ("Junior");
        devJunior.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Junior" + devDebora.getConteudosIncritos());
        devJunior.progredir();
        devJunior.progredir();
        devJunior.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Junior" + devDebora.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Junior" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devJunior.calcularTotalXp());






    }
}