package aula07e08;

public class Lutador implements UltraEmojiCombat {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <= 49) {
            this.categoria = "Peso Mosca-ligeiro";
        } else if (this.peso <= 52) {
            categoria = "Peso Mosca";
        } else if (this.peso <= 56) {
            this.categoria = "Peso Galo";
        } else if (this.peso <= 60) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 64) {
            this.categoria = "Peso Médio-ligeiro";
        } else if (this.peso <= 69) {
            this.categoria = "Peso Meio-médio";
        } else if (this.peso <= 75) {
            this.categoria = "Peso Médio";
        } else if (this.peso <= 81) {
            this.categoria = "Peso Meio-pesado";
        } else if (this.peso <= 91) {
            this.categoria = "Peso Pesado";
        } else if (this.peso < 120) {
            this.categoria = "Peso Superpesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    @Override
    public void apresentar() {
        System.out.print("\nCHEGOU A HORA!\nApresentamos o lutador " + this.getNome() + ", diretamente de " + this.getNacionalidade());
        System.out.println(", com " + this.getIdade() + " anos e " + this.getAltura() + "m.");
        System.out.print("Pesando: " + this.getPeso() + "Kg | ");
        System.out.print(this.getVitorias() + " vitorias - ");
        System.out.print(this.getDerrotas() + " derrotas - ");
        System.out.print(this.getEmpates() + " empates. \n");
    }

    @Override
    public void status() {
        System.out.println("\n" + this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates() + "\n");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}