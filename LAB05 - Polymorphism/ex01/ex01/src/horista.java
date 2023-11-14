public class horista extends funcionario {
    private double valorHora;
    private double totalHoras;

    public horista() {
    }

    public horista(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.salario = 0;
    }

    public void alterarSalario(double valorHora, double totalHoras) {
        this.salario = valorHora*totalHoras;
        this.totalHoras = totalHoras;
        this.valorHora = valorHora;
    }

    public double retornarSalario() {
        return salario;
    }

    public void mostrar () {
        System.out.println("\nHorista: ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_nasc);
        System.out.println("Valor por hora e quant horas: " + valorHora + ", " + totalHoras);
        System.out.println("Último salário recebido: " + salario);
    }
}
