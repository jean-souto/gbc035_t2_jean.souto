import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, option, i;

        System.out.println("Digite a quantidade de formas que quer cadastrar: ");
        n = scan.nextInt();
        forma[] formas = new forma[n];

        for (i = 0; i < n; i++) {
            System.out.println("Digite qual forma você quer cadastrar: ");
            System.out.println("1. Círculo 2. Quadrado 3. Triangulo 4. Cubo 5. Tetraedro 6. Esfera");
            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Digite o numero de arestas e o raio do circulo:");
                    formas[i] = new circulo(scan.nextInt(), scan.nextDouble());
                }
                case 2 -> {
                    System.out.println("Digite o lado e o numero de arestas do quadrado: ");
                    formas[i] = new quadrado(scan.nextDouble(), scan.nextInt());
                }
                case 3 -> {
                    System.out.println("Digite a base, a altura e as arestas do triangulo: ");
                    formas[i] = new triangulo(scan.nextDouble(), scan.nextDouble(), scan.nextInt());
                }
                case 4 -> {
                    System.out.println("Digite o lado e as arestas do cubo: ");
                    formas[i] = new cubo(scan.nextDouble(), scan.nextInt());
                }
                case 5 -> {
                    System.out.println("Digite a aresta, a atura e quantas arestas tem o tetraedro: ");
                    formas[i] = new tetraedro(scan.nextDouble(), scan.nextDouble(), scan.nextInt());
                }
                case 6 -> {
                    System.out.println("Digite o raio da esfera e as arestas:");
                    formas[i] = new cubo(scan.nextDouble(), scan.nextInt());
                }
                default -> {
                    i--;
                    System.out.println("Digite um número válido.");
                }
            }
        }

        System.out.println("Mostrando todas as formas cadastradas e suas informações.");

        for (i = 0; i < n; i++) {
            formas[i].mostrar();
        }
    }
}