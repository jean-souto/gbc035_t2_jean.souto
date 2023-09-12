public class pessoa {
    private String nome;
    private int idade;
    private String profissao;
    private acessorio Acessorio;

    public pessoa (String nome, String profissao, int idade, acessorio Acessorio) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.Acessorio = Acessorio;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void showAcessorio() {
        Acessorio.mostrarAcessorio();
    }

    public void showPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }
}
