import java.util.Scanner;

public class ex3 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int i;
        figurinhas[] album = new figurinhas[5];

        System.out.println("Digite as informacoes dos jogadores:");
        for (i = 0; i < 5; i++) {
            album[i] = new figurinhas();
            album[i].novo((scan.next()),(scan.next()),(scan.next()),(scan.next()),(scan.nextFloat()),(scan.nextFloat()));
        }

        System.out.println("Jogadores cadastrados: ");
        for (i = 0; i < 5; i++) {
            album[i].mostrar(album[i]);
        }
    }
}
