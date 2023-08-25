import java.util.Scanner;
public class ex9 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int tamanho = 0;
        int i, j;
        float media = 0;

        do {
            System.out.println("Digite a quantidade de alunos: ");
            tamanho = scan.nextInt();

            if (tamanho < 1 || tamanho > 100) {
                System.out.println("Quantidade de alunos inválida! Tente novamente.");
            }
        }while(tamanho < 1 || tamanho > 100);

        int[] alunos = new int[tamanho];

        for (i = 0; i < tamanho; i++) {
            System.out.println("Digite a nota do aluno " + i + ":");
            alunos[i] = scan.nextInt();
            media += alunos[i];
        }

        media /= tamanho;

        for (i = 0; i < tamanho; i++) {
            System.out.println("Nota do aluno " + i + ": " + alunos[i]);
        }

        System.out.println("Media geral: " + media);
    }
}
