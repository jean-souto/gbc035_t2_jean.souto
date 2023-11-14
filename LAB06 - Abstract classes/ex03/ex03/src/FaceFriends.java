import java.util.Scanner;

public class FaceFriends {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int nun, func = -1, option, tam = 0;

        System.out.println("Digite a quantidade de contatos que quer cadastrar: ");
        nun = scan.nextInt();
        Contato[] contatos = new Contato[nun];

        while (func != 0) {

            System.out.println("\nDigite a opção que você quer: ");
            System.out.println("1. Cadastrar novo contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir os melhores amigos, irmãos e colegas");
            System.out.println("7. Imprimir contato específico");
            System.out.println("0. Sair\n");
            option = scan.nextInt();

            switch (option) {
                case 1:

                    if (tam >= nun) break;

                    System.out.println("\nDigite qual contato você quer cadastrar:");
                    System.out.println("1. Amigo");
                    System.out.println("2. Familia");
                    System.out.println("3. Colega");
                    option = scan.nextInt();

                    switch (option) {
                        case 1:
                            if (tam < nun) {
                                System.out.println("\nCadastrando amigo:");
                                System.out.println("Digite o apelido, nome, email, aniversario e grau:");
                                contatos[tam] = new Amigos(scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt());
                                tam++;
                            }
                            break;

                        case 2:
                            if (tam < nun) {
                                System.out.println("\nCadastrando familiar:");
                                System.out.println("Digite o apelido, nome, email, aniversario e parentesto:");
                                contatos[tam] = new Familia(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
                                tam++;
                            }
                            break;

                        case 3:
                            if (tam < nun) {
                                System.out.println("\nCadastrando colega:");
                                System.out.println("Digite o apelido, nome, email, aniversario e tipo:");
                                contatos[tam] = new Trabalho(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
                                tam++;
                            }
                            break;

                        default:
                            System.out.println("ERRO!");
                            option = -1;
                    }
                    break;

                case 2:
                    for (int i = 0; i < tam; i++) {
                        contatos[i].imprimirContato();
                    }
                    break;

                case 3:
                    for (int i = 0; i < tam; i++) {
                        if (contatos[i] instanceof Familia) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < tam; i++) {
                        if (contatos[i] instanceof Amigos) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < tam; i++) {
                        if (contatos[i] instanceof Trabalho) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 6:
                    for (int i = 0; i < tam; i++) {
                        if (((contatos[i] instanceof Familia) && (((Familia) contatos[i]).getParentesco().equals("irmão"))) || ((contatos[i] instanceof Amigos) && (((Amigos) contatos[i]).getGrau().equals("melhor amigo"))) || (((contatos[i] instanceof Trabalho) && (((Trabalho) contatos[i]).getTipo().equals("colega"))))) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Digite a coordenada que quer ver: ");
                    option = scan.nextInt();

                    if (option >= 0 && option < tam) {
                        contatos[option].imprimirContato();
                    }
                    break;

                default:
                    System.out.println("Saindo...");
                    func = 0;
            }
        }
    }
}
