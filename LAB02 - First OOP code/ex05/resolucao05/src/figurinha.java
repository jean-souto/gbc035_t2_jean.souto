public class figurinha {
    String nome;
    String posicao;
    String pais;
    float altura, peso;

    public figurinha (String country) {
        pais = country;
    }

    public void mostrarfig (figurinha a) {
        System.out.println("Nome: " + nome + "; Posição: " + posicao + "; País: " + pais + "; Altura: " + altura + "; Peso: " + peso);
    }
}
