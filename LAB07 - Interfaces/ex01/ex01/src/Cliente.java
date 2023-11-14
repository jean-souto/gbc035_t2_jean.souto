public class Cliente implements Classificavel {
    private String nome;

    public Cliente () {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean eMenorQue (Classificavel o) {
        Cliente compara = (Cliente)o;
        return this.nome.compareTo(compara.nome) > 0;
    }
}