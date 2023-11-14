// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto[] prods = new Produto[3];
        Servico[] servs = new Servico[3];
        Cliente[] clits = new Cliente[3];

        prods[0] = new Produto(1);
        prods[1] = new Produto(24);
        prods[2] = new Produto(1);

        servs[0] = new Servico(123);
        servs[1] = new Servico(1100);
        servs[2] = new Servico(85);

        clits[0] = new Cliente("Joao");
        clits[1] = new Cliente("Joao Antonio");
        clits[2] = new Cliente("Caio");

        sortAlgProd(prods);
        sortAlgClient(clits);
        sortAlgServ(servs);

        System.out.println("Mostrando prods: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ": " + prods[i].getCodigo());
        }

        System.out.println("Mostrando servs: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ": " + servs[i].getPreco());
        }

        System.out.println("Mostrando clients: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ": " + clits[i].getNome());
        }
    }

    public static void sortAlgProd (Produto[] vet) {
        for (int i = 0; i < vet.length-1; i++) {
            int n = vet[i].getCodigo();
            int j = vet[i+1].getCodigo();

            if (j > n) {
                Produto temp = new Produto();
                temp = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = temp;
                i--;
            }
        }
    }

    public static void sortAlgClient (Cliente[] vet) {
        for (int i = 0; i < vet.length-1; i++) {
            String a = vet[i].getNome();
            String b = vet[i+1].getNome();
            if (a.compareTo(b) < 0) {
                Cliente temp = new Cliente();
                temp = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = temp;
                i--;
            }
        }
    }

    public static void sortAlgServ (Servico[] vet) {
        for (int i = 0; i < vet.length-1; i++) {
            double n = vet[i].getPreco();
            double j = vet[i+1].getPreco();

            if (j > n) {
                Servico temp = new Servico();
                temp = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = temp;
                i--;
            }
        }
    }
}