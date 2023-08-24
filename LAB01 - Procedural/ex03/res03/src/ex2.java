import java.util.Scanner;

public class ex2 {

    public static void main (String[] args) {

        int[] vetor = new int[6];
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 6 valores inteiros:");

        for (i = 0; i < 6; i++)
        {
            vetor[i] = scan.nextInt();
        }

        System.out.println("Valores lidos:");

        for (i = 0; i < 6; i++)
        {
            System.out.println(vetor[i]);
        }
    }
}