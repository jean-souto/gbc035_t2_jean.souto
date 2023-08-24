import java.util.Scanner;

public class ex7 {

    public static void main (String[] args) {
        float[] alunos = new float[5];
        float nun = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as notas dos alunos: ");

        for (int i = 0; i < 5; i++)
        {
            alunos[i] = scan.nextFloat();
        }

        nun = alunos[0];

        for (int i = 0; i < 5; i++)
        {
            if (alunos[i] > nun) {
                nun = alunos[i];
            }
        }

        nun = 100/nun;

        System.out.println("As notas normalizadas sao: ");

        for (int i = 0; i < 5; i++)
        {
            alunos[i] = alunos[i]*nun;
            System.out.println(alunos[i]);
        }
    }
}
