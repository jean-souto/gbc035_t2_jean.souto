import java.util.Scanner;
import java.util.*;

public class ex11 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vetPAR = new ArrayList<Integer>();
        ArrayList<Integer> vetIMPAR = new ArrayList<Integer>();
        int[] vet = new int[5];


        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            vet[i] = scan.nextInt();
            if ((vet[i] % 2) == 0) {
                vetPAR.add(vet[i]);
            } else {
                vetIMPAR.add(vet[i]);
            }
        }

        System.out.println("Você digitou: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }

        System.out.println("São pares: ");
        for (int i = 0; i < vetPAR.size(); i++) {
            System.out.println(vetPAR.get(i));
        }

        System.out.println("São impares: ");
        for (int i = 0; i < vetIMPAR.size(); i++) {
            System.out.println(vetIMPAR.get(i));
        }
    }
}
