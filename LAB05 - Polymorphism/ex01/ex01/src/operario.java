public class operario extends funcionario {
    private double producao;
    private double quantProd;

    public operario() {
    }

    public operario(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.salario = 0;
    }

    public void alterarSalario(double producao, double quantProd) {
        this.salario = producao*quantProd;
        this.producao = producao;
        this.quantProd = quantProd;
    }

    public double retornarSalario() {
        return salario;
    }

    public void mostrar () {
        System.out.println("\nOperario: ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_nasc);
        System.out.println("Valor por prod e quant última prod: " + producao + ", " + producao);
        System.out.println("Último salário recebido: " + salario);
    }
}
