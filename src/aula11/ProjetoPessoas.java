package aula11;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("Eduardo");
        v1.setIdade(17);
        v1.setSexo("Masculino");
        System.out.println(v1);

        System.out.println();
        Aluno a1 = new Aluno();
        a1.setNome("Graziele");
        a1.setMatricula(0321);
        a1.setCurso("Medicina");
        a1.setIdade(17);
        a1.fazerAniversario();
        a1.setSexo("Feminino");
        System.out.println(a1);
        System.out.println(a1.getCurso());
        a1.pagarMensalidade();

        System.out.println();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(0123);
        b1.setNome("Eduardo");
        b1.setSexo("Masculino");
        b1.setIdade(17);
        b1.setCurso("Engenharia de Software");
        System.out.println(b1);
        b1.pagarMensalidade();

        System.out.println();
        Tecnico t1 = new Tecnico();
        t1.setMatricula(0123);
        t1.setNome("Padilha");
        t1.setSexo("Masculino");
        t1.setIdade(42);
        t1.setCurso("TI");
        System.out.println(t1);
        t1.pagarMensalidade();

        System.out.println();
        Professor p1 = new Professor();
        p1.setNome("Junior Paradise");
        p1.setSexo("Masculino");
        p1.setIdade(42);
        p1.setSalario(18000f);
        p1.receberAumento(2345f);
        p1.setEspeciliadade("IA");
        System.out.println(p1);
        System.out.println(p1.getEspeciliadade());
        System.out.println(p1.getSalario());

    }
}
