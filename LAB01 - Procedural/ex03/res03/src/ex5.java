import java.util.Scanner;

public class ex5 {

    public static void main (String[] args) {

        int[] vetor = new int[6];
        int i, maior, menor;
        float media = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 6 valores inteiros:");

        for (i = 0; i < 6; i++)
        {
            vetor[i] = scan.nextInt();
        }

        System.out.println("Valores lidos:");

        maior = vetor[0];
        menor = vetor[0];

        for (i = 0; i < 6; i++)
        {
            media += vetor[i];
            if (vetor[i] > maior)
            {
                maior = vetor[i];
            }

            if (vetor[i] < menor)
            {
                menor = vetor[i];
            }
            System.out.println(vetor[i]);
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Media: " + media/6);
    }
}
