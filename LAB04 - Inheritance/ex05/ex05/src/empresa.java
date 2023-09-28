import java.util.Scanner;
public class empresa {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        chefe[] func_chefe = new chefe[2];
        vendedor[] func_vendedor = new vendedor[2];
        operario[] func_operario = new operario[2];
        horista[] func_horista = new horista[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite o nome, data de nascimento e salario do chefe " + i + ":");
            func_chefe[i] = new chefe((scan.next()), (scan.next()));
            func_chefe[i].alterarSalario(scan.nextDouble());

            System.out.println("\nDigite o nome e data de nascimento do vendedor " + i + ":");
            func_vendedor[i] = new vendedor((scan.next()), (scan.next()));
            System.out.println("Agora digite o salario base, porcentagem da comissao e quantidade de vendas: ");
            func_vendedor[i].alterarSalario((scan.nextDouble()), (scan.nextDouble()/100), (scan.nextInt()));

            System.out.println("\nDigite o nome e data de nascimento do operario " + i + ":");
            func_operario[i] = new operario((scan.next()), (scan.next()));
            System.out.println("Agora digite quanto o operario recebe por prod e a prod total: ");
            func_operario[i].alterarSalario((scan.nextDouble()), (scan.nextDouble()));

            System.out.println("\nDigite o nome e data de nascimento do horista " + i + ":");
            func_horista[i] = new horista((scan.next()), (scan.next()));
            System.out.println("Agora digite o valor da hora e quantas horas ele trabalhou: ");
            func_horista[i].alterarSalario((scan.nextDouble()), (scan.nextDouble()));
        }

        System.out.println("Mostrando funcionários da empresa: ");
        for (int i = 0; i < 2; i++) {
            func_chefe[i].mostrar_chefe();
        }

        for (int i = 0; i < 2; i++) {
            func_vendedor[i].mostrar_vendedor();
        }

        for (int i = 0; i < 2; i++) {
            func_operario[i].mostrar_operario();
        }

        for (int i = 0; i < 2; i++) {
            func_horista[i].mostrar_horista();
        }
    }

}
