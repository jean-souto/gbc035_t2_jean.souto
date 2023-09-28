public class chefe extends funcionario {
    public chefe() {
    }

    public chefe(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.salario = 0;
    }

    public void alterarSalario(double salario) {
        this.salario = salario;
    }

    public double retornarSalario() {
        return salario;
    }

    public void mostrar_chefe () {
        System.out.println("\nChefe: ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_nasc);
        System.out.println("Último salário recebido: " + salario);
    }
}
