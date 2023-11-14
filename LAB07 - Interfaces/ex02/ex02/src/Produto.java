public class Produto implements Classificavel {
    private int codigo;

    public Produto () {
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int eMenorQue (Classificavel o) {
        Produto compara = (Produto)o;
        if (this.codigo > compara.codigo) return 1;
        if (this.codigo < compara.codigo) return -1;
        return 0;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}