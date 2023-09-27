public class c1 {

    String nomeC1;
    private int nunC1;
    protected double nun_doubleC1;
    
    public c1 () {
        System.out.println("Classe C1: passando pelo construtor sem parâmetros");
    }

    public c1 (String nomeC1, int nunC1, double nun_doubleC1) {
        this.nomeC1 = nomeC1;
        this.nunC1 = nunC1;
        this.nun_doubleC1 = nun_doubleC1;

        System.out.println("Classe C1: passando pelo construtor com parâmetros");
    }

    public void mostrar_atb () {
        System.out.println("Atributos C1: ");
        System.out.println("nome: " + nomeC1);
        System.out.println("int: " + nunC1);
        System.out.println("double: " + nun_doubleC1);
    }

    public void mostrar_atb_super () {
        System.out.println("Atributos C1: ");
        System.out.println("nome: " + nomeC1);
        System.out.println("int: " + nunC1);
        System.out.println("double: " + nun_doubleC1);
    }
}