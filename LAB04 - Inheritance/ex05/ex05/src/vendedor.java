public class vendedor extends funcionario {
    private double comissao;
    private int vendas;

    public vendedor() {
    }

    public vendedor(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.salario = 0;
    }

    public void alterarSalario(double salario, double comissao, int vendas) {
        salario = salario + (comissao*vendas);
        this.comissao = comissao;
        this.vendas = vendas;
        this.salario = salario;
    }

    public double retornarSalario() {
        return salario;
    }

    public void mostrar_vendedor () {
        System.out.println("\nVendedor: ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_nasc);
        System.out.println("últimas vendas e última comissão: " + vendas + ", " + comissao);
        System.out.println("Último salário recebido: " + salario);
    }
}
