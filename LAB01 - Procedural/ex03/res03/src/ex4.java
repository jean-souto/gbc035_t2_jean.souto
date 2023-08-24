import java.util.Scanner;

public class ex4 {

    public static void main (String[] args) {

        int[] vet = new int[6];
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 6 numeros pares:");

        for (i = 0; i < 6; i++)
        {
            vet[i] = scan.nextInt();

            if ((vet[i] % 2) != 0) {
                System.out.println("Numero nao eh par");
                i--;
            }
        }

        System.out.println("Numeros digitados:");

        for (i = 0; i < 6; i++)
        {
            System.out.println(vet[i]);
        }
    }
}
