public class loja {
    private String nome;
    private String categoria;
    private setor setor;

    public loja (String nome, String categoria, setor setor) {
        this.nome = nome;
        this.categoria = categoria;
        this.setor = setor;
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

    public void apagarSetor () {
        setor.setNome(null);
        setor.setItemPrincipal(null);
        setor.setQuant(0);
    }
}
