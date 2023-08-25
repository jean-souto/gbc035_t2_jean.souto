import java.util.Scanner;
public class ex10 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] vet3 = new int[3];
        int i;

        System.out.println("Digite 3 numeros iniciais e 3 que serao subtraidos: ");

        for (i = 0; i < 3; i++) {
            vet1[i] = scan.nextInt();
        }

        for (i = 0; i < 3; i++) {
            vet2[i] = scan.nextInt();
        }

        System.out.println("Os resultados sao: ");

        for (i = 0; i < 3; i++) {
            vet3[i] = vet1[i] - vet2[i];
            System.out.println(vet3[i]);
        }
    }
}
