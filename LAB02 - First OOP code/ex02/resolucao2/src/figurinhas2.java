public class figurinhas2 {

    private String nome;
    private String posicao;
    private String nascimento;
    private String pais;
    private float peso, altura;

    public void novo (String nomep, String posicaop, String nascp, String paisp, float pesop, float alturap) {
        nome = nomep;
        posicao = posicaop;
        nascimento = nascp;
        pais = paisp;
        peso = pesop;
        altura = alturap;
    }

    public void mostrar (figurinhas2 a) {
        System.out.println("Jogador: " + a.nome + ", " + a.posicao + ", " + a.nascimento + ", " + a.pais + ", " + a.peso + ", " + a.altura);
    }
}
