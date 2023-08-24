import java.util.Scanner;

public class ex3 {

    public static void main (String[] args)
    {
        int[] vet = new int[6];
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seis valores:");

        for (i = 0; i < 6; i++)
        {
            vet[i] = scan.nextInt();
        }

        System.out.println("Valores digitados invertidos:");

        for (i = 5; i >= 0; i--)
        {
            System.out.println(vet[i]);
        }
    }
}
