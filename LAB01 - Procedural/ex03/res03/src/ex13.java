import java.util.Scanner;
public class ex13 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scan.nextInt();

            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("Números atualizados: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}
