import java.util.Scanner;
public class ex8 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];
        int i;
        float media = 0;

        System.out.println("Digite 5 numeros: ");
        for (i = 0; i < 5; i++) {
            vetor[i] = scan.nextInt();
            media += vetor[i];
        }

        media = media/5;

        System.out.println("A media dos numeros eh: " + media);
    }
}
