public class selecao {
    String nome;
    String pais;
    String tecnico;
    figurinha[] jogadores = new figurinha[11];
    public selecao (String name, String tec, String country){
        nome = name;
        pais = country;
        tecnico = tec;
        for (int i = 0; i < 11; i++) {
            jogadores[i] = new figurinha(country);
        }
    }

    private void mostrarfig (figurinha a) {
        System.out.println("Nome: " + a.nome + "; Posição: " + a.posicao + "; País: " + a.pais + "; Altura: " + a.altura + "; Peso: " + a.peso);
    }

    public void mostrarselecao (selecao a) {
        System.out.println("Nome: " + a.nome + "; Tecnico: " + a.tecnico + "; País: " + a.pais);
        System.out.println("Jogadores: ");
        for (int i = 0; i < 11; i++) {
            mostrarfig(a.jogadores[i]);
        }
    }
}
