public class acessorio {
    String nome;
    String categoria;
    float valor;

    public acessorio (String nome, String categoria, float valor) {
        this.categoria = categoria;
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getValor() {
        return valor;
    }

    public void mostrarAcessorio () {
        System.out.println(nome + ", " + categoria + ", " + valor);
    }
}
