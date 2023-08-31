import java.util.Scanner;
import java.util.Set;

public class ex4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        selecao a = new selecao();

        System.out.println("nome: ");
        a.nome = scan.next();
        System.out.println("país");
        a.pais = scan.next();
        System.out.println("tecnico");
        a.tecnico = scan.next();
        System.out.println("Digite o nome dos 11 jogadores: ");
        for (int i = 0; i < 11; i++) {
            a.jogadores[i] = scan.next();
        }

        System.out.println("Seleção: " + a.nome);
        System.out.println("País: " + a.pais);
        System.out.println("Técnico: " + a.tecnico);
        System.out.println("Jogadores: ");
        for (int i = 0; i < 11; i++) {
            System.out.println(a.jogadores[i]);
        }
    }
}
