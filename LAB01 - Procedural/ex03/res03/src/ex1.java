import java.util.Scanner;

public class ex1 {

    public static void main (String[] args) {

        // Declara um array de inteiros com tamanho 6 para armazenar os valores
        int[] numeros = new int[6];

        // Cria um objeto Scanner para ler os valores da entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // Imprime uma mensagem pedindo ao usuário para digitar 6 valores inteiros
        System.out.println("Digite 6 valores inteiros:");

        // Lê os valores inteiros e os armazena nas posições do array
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();
        numeros[3] = scanner.nextInt();
        numeros[4] = scanner.nextInt();
        numeros[5] = scanner.nextInt();

        // Imprime uma mensagem indicando que os valores lidos serão exibidos
        System.out.println("Valores lidos:");

        // Exibe cada valor armazenado no array em uma nova linha
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
    }
}