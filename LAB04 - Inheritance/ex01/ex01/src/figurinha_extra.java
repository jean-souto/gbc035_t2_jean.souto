import java.util.Objects;

public class figurinha_extra {
    private String nome;
    private String nasc;
    private String position;
    private String country;
    private double altura;
    private double peso;
    private String tipo;
    private String cor;

    public figurinha_extra (String nome, String nasc, String position, String country, double altura, double peso, String tipo, String cor) {
        this.nome = nome;
        this.nasc = nasc;
        this.position = position;
        this.country = country;
        this.altura = altura;
        this.peso = peso;

        if (!Objects.equals(tipo, ("legend")) && !Objects.equals(tipo, ("hookie"))) {
            this.tipo = null;
        } else {
            this.tipo = tipo;
        }

        if (!Objects.equals(cor, ("bordô")) && !Objects.equals(cor, ("bronze")) && !Objects.equals(cor, ("prata")) && !Objects.equals(cor, ("ouro"))) {
            this.cor = null;
        } else {
            this.cor = cor;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrar_fig_extra () {
        System.out.println("Informações do jogador:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + nasc);
        System.out.println("Posição: " + position);
        System.out.println("País: " + country);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Classe: " + tipo);
        System.out.println("Cor: " + cor);
    }
}
