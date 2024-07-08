package aula10;

public class Professor extends Pessoa{
    private String especiliadade;
    private float salario;

    public void receberAumento(float aumento) {
        this.salario += aumento;
    }

    public String getEspeciliadade() {
        return especiliadade;
    }

    public void setEspeciliadade(String especiliadade) {
        this.especiliadade = especiliadade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
