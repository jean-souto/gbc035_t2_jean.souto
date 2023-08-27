import java.util.Scanner;
public class ex12 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] bolas = new int[4];
        float[] porcentagem = new float[4];
        int total = 0, i;

        System.out.println("Digite a quantidade de bolas de cada cor (verde, azul, vermelho e amarelo): ");
        for (i = 0; i < 4; i++) {
            bolas[i] = scan.nextInt();
            total += bolas[i];
            bolas[i] *= 100;
        }

        for (i = 0; i < 4; i++) {
            porcentagem[i] = bolas[i]/total;
        }

        System.out.println("Verdes: " + porcentagem[0]);
        System.out.println("Azuis: " + porcentagem[1]);
        System.out.println("Vermelhas: " + porcentagem[2]);
        System.out.println("Amarelas: " + porcentagem[3]);

    }
}
