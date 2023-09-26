public class figurinha {
    protected String nome;
    protected String nasc;
    protected String position;
    protected String country;
    protected double altura;
    protected double peso;

    public figurinha (String nome, String nasc, String position, String country, double altura, double peso) {
        this.nome = nome;
        this.nasc = nasc;
        this.position = position;
        this.country = country;
        this.altura = altura;
        this.peso = peso;
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

    public void mostrar_fig () {
        System.out.println("Informações do jogador:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + nasc);
        System.out.println("Posição: " + position);
        System.out.println("País: " + country);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}