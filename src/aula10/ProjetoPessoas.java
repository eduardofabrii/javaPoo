package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Eduardo");
        p2.setNome("Graziele");
        p3.setNome("Paulo");
        p4.setNome("Omar");

        p1.setIdade(17);
        p2.setIdade(17);
        p3.setIdade(45);
        p4.setIdade(38);

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");

        p2.setCurso("Sistemas de Informação.");
        p2.fazerAniversario();
        p4.setTrabalhando(true);
        p3.setSalario(12.435f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
