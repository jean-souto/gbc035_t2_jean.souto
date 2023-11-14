import java.util.Scanner;

public class empresa {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        funcionario[] base_empresa = new funcionario[8];
        int controle = 0;

        for (int i = 0; i < 8; i++) {

            System.out.println("Digite qual tipo de funcionário você deseja cadastrar: ");
            System.out.println("1. Chefe / 2. Operário / 3. Vendedor / 4. Horista");
            controle = scan.nextInt();

            switch (controle) {
                case 1:
                    System.out.println("\nDigite o nome, data de nascimento e salario do chefe " + i + ":");
                    base_empresa[i] = new chefe((scan.next()), (scan.next()));
                    ((chefe) (base_empresa[i])).alterarSalario(scan.nextDouble());
                break;

                case 2:
                    System.out.println("\nDigite o nome e data de nascimento do operario " + i + ":");
                    base_empresa[i] = new operario((scan.next()), (scan.next()));
                    System.out.println("Agora digite quanto o operario recebe por prod e a prod total: ");
                    ((operario) (base_empresa[i])).alterarSalario((scan.nextDouble()), (scan.nextDouble()));
                break;

                case 3:
                    System.out.println("\nDigite o nome e data de nascimento do vendedor " + i + ":");
                    base_empresa[i] = new vendedor((scan.next()), (scan.next()));
                    System.out.println("Agora digite o salario base, porcentagem da comissao e quantidade de vendas: ");
                    ((vendedor) (base_empresa[i])).alterarSalario((scan.nextDouble()), (scan.nextDouble()/100), (scan.nextInt()));
                break;

                case 4:
                    System.out.println("\nDigite o nome e data de nascimento do horista " + i + ":");
                    base_empresa[i] = new horista((scan.next()), (scan.next()));
                    System.out.println("Agora digite o valor da hora e quantas horas ele trabalhou: ");
                    ((horista) (base_empresa[i])).alterarSalario((scan.nextDouble()), (scan.nextDouble()));
                break;
            }
        }

        System.out.println("Mostrando funcionários da empresa: ");
        for (int i = 0; i < 8; i++) {
            base_empresa[i].mostrar();
        }
    }
}
