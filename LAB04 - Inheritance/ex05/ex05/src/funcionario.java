public class funcionario {
    protected String nome;
    protected String data_nasc;
    protected double salario;

    public funcionario () {
    }

    public funcionario(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.salario = 0;
    }

    public void alterarSalario (double salario) {
        this.salario = salario;
    }

    public double retornarSalario () {
        return salario;
    }
}
