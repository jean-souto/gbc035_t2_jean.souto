import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("123", "Pedro", 100);

        try {
            func.aumentaSalario(-1000);
        } catch (ExceptionTeste e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: " + func.getSalario());
        }
    }
}