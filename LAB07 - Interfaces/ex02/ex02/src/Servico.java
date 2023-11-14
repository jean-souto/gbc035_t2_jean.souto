public class Servico implements Classificavel {
    private double preco;

    public Servico () {
    }

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int eMenorQue (Classificavel o) {
        Servico compara = (Servico) o;
        if (this.preco > compara.preco) return 1;
        if (this.preco < compara.preco) return -1;
        return 0;
    }
}