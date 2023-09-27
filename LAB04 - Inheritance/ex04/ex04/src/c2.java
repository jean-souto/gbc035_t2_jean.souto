public class c2 extends c1 {

    String nomeC2;
    private int nunC2;
    protected double nun_doubleC2;

    public c2 () {
        super();
        System.out.println("Classe C2: passando pelo construtor sem parâmetros");
    }

    public c2 (String nomeC1, String nomeC2, int nunC2, double nun_doubleC2, double nun_doubleC1) {
        this.nomeC1 = nomeC1;
        this.nomeC2 = nomeC2;
        this.nunC2 = nunC2;
        this.nun_doubleC2 = nun_doubleC2;
        this.nun_doubleC1 = nun_doubleC1;
        System.out.println("Classe C2: passando pelo construtor com parâmetros");
    }

    public void mostrar_atb () {
        System.out.println("\nAtributos de C2: ");
        System.out.println("nome 1: " + nomeC1);
        System.out.println("nome 2: " + nomeC2);
        System.out.println("int 2: " + nunC2);
        System.out.println("double 1: " + nun_doubleC1);
        System.out.println("double 2: " + nun_doubleC2);
    }

    public void mostrar_atb_super () {
        super.mostrar_atb_super();
        System.out.println("nome 2: " + nomeC2);
        System.out.println("int 2: " + nunC2);
        System.out.println("double 2: " + nun_doubleC2);

    }
}
