import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ex14 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade = 0;

        System.out.println("Digite a quantidade de alunos a serem cadastrados: ");
        quantidade = scan.nextInt();

        int[] matriculas = new int[quantidade];
        char[] social = new char[quantidade];
        float[] cra = new float[quantidade];

        System.out.println("Digite as informações dos alunos: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Matricula: ");
            matriculas[i] = scan.nextInt();

            System.out.println("Digite a classe do aluno " + matriculas[i] + ": ");
            social[i] = scan.next().charAt(0);

            System.out.println("Digite o cra do aluno " + matriculas[i] + ": ");
            cra[i] = scan.nextFloat();
        }

        System.out.println("Alunos cadastrados:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Aluno " + i + ": ");
            System.out.println(matriculas[i] + "," + social[i] + "," + cra[i]);
        }
    }
}
