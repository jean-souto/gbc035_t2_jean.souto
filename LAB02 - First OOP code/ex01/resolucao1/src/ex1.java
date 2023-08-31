import java.util.Scanner;
public class ex1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        figurinhas a = new figurinhas();
        figurinhas b = new figurinhas();
        figurinhas c = new figurinhas();

        System.out.println("Digite o nome do jogador 1: ");
        a.nome = scan.next();
        System.out.println("Digite a data de nascimento do jogador 1: ");
        a.datanasc = scan.next();
        System.out.println("Digite a posição do jogador 1: ");
        a.posicao = scan.next();
        System.out.println("Digite o país do jogador 1: ");
        a.pais = scan.next();
        System.out.println("Digite a altura e o peso do jogador 1: ");
        a.altura = scan.nextFloat();
        a.peso = scan.nextFloat();

        System.out.println("Digite o nome do jogador 2: ");
        b.nome = scan.next();
        System.out.println("Digite a data de nascimento do jogador 2: ");
        b.datanasc = scan.next();
        System.out.println("Digite a posição do jogador 2: ");
        b.posicao = scan.next();
        System.out.println("Digite o país do jogador 2: ");
        b.pais = scan.next();
        System.out.println("Digite a altura e o peso do jogador 2: ");
        b.altura = scan.nextFloat();
        b.peso = scan.nextFloat();

        System.out.println("Digite o nome do jogador 3: ");
        c.nome = scan.next();
        System.out.println("Digite a data de nascimento do jogador 3: ");
        c.datanasc = scan.next();
        System.out.println("Digite a posição do jogador 3: ");
        c.posicao = scan.next();
        System.out.println("Digite o país do jogador 3: ");
        c.pais = scan.next();
        System.out.println("Digite a altura e o peso do jogador 3: ");
        c.altura = scan.nextFloat();
        c.peso = scan.nextFloat();

        System.out.println("Jogador 1: " + a.nome + ", " + a.posicao + ", " + a.pais + ", " + a.datanasc + ", " + a.peso + ", " + a.altura);
        System.out.println("Jogador 2: " + b.nome + ", " + b.posicao + ", " + b.pais + ", " + b.datanasc + ", " + b.peso + ", " + b.altura);
        System.out.println("Jogador 3: " + c.nome + ", " + c.posicao + ", " + c.pais + ", " + c.datanasc + ", " + c.peso + ", " + c.altura);
    }
}
