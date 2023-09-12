public class setor {
    private String nome;
    private String itemPrincipal;
    private int quant;

    public setor (String nome, String itemPrincipal, int quant) {
        this.nome = nome;
        this.itemPrincipal = itemPrincipal;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public String getItemPrincipal() {
        return itemPrincipal;
    }

    public int getQuant() {
        return quant;
    }

    public void mostrarSetor () {
        System.out.println("Nome: " + nome);
        System.out.println("Item principal: " + itemPrincipal);
        System.out.println("Quantidade: " + quant);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setItemPrincipal(String itemPrincipal) {
        this.itemPrincipal = itemPrincipal;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
