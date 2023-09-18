public class loja {
    private String nome;
    private String categoria;
    private setor setor;

    public loja (String nome, String categoria, String nome_setor, int quant_setor, String item_setor) {
        this.nome = nome;
        this.categoria = categoria;
        setor = new setor(nome_setor, item_setor, quant_setor);
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void mostrarLoja () {
        System.out.println("Nome da loja: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Setor: ");
        setor.mostrarSetor();
    }

    public void apagarLoja () {
        setor.limparSetor();
        nome = null;
        categoria = null;
    }
}
