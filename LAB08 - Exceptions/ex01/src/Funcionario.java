public class Funcionario {
    protected String cpf;
    protected String nome;
    protected double salario;

    private double tetoSalario;

    public Funcionario () {
        tetoSalario = 40000;
    }

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        tetoSalario = 40000;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getTetoSalario() {
        return tetoSalario;
    }

    public void setTetoSalario(double tetoSalario) {
        this.tetoSalario = tetoSalario;
    }

    public void aumentaSalario (double porcentagem) {
        double reajuste = 0;
        double salarioTemp = 0;

        reajuste = salario*(porcentagem/100);
        salarioTemp = salario+reajuste;

        if (salarioTemp > tetoSalario) {
            throw new ExceptionTeste("Valor inválido pois ultrapassa o teto!");
        } else {
            if (salarioTemp <= 0) {
                throw new ExceptionTeste("Valor é abaixo de zero!");
            } else {
                salario = salarioTemp;
            }
        }
    }

}
