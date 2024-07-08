package aula14;

public class User extends Pessoa {
    private String login;
    private int totAssistido;

    public User(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    @Override
    public String toString() {
        return "User [" + super.toString() +
                " | Login: " + login +
                " | Total Assistido: " + totAssistido +
                ']';
    }

    public void viuMaisUm() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
