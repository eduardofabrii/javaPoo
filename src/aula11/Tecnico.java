package aula11;

public class Tecnico extends Aluno {
    private boolean registroProfissional;

    public void praticar() {
        System.out.println("Praticando...");
    }

    public boolean isRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
