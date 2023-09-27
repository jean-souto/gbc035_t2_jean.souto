public class c3 extends c2 {

    String nomeC3;
    private int nunC3;
    protected double nun_doubleC3;

    public c3 () {
        super();
        System.out.println("Classe C3: passando pelo construtor sem parâmetros");
    }

    public c3 (String nomeC1, String nomeC2, String nomeC3, int nunC2, int nunC3, double nun_doubleC1, double nun_doubleC2, double nun_doubleC3) {
        super (nomeC1, nomeC2, nunC2, nun_doubleC2, nun_doubleC1);
        this.nun_doubleC3 = nun_doubleC3;
        this.nomeC3 = nomeC3;
        this.nunC3 = nunC3;
        System.out.println("Classe C3: passando pelo construtor com parâmetros");
    }

    public void mostrar_atb () {
        System.out.println("\nAtributos de C3: ");
        System.out.println("nome 1: " + nomeC1);
        System.out.println("nome 2: " + nomeC2);
        System.out.println("nome 3: " + nomeC3);
        System.out.println("int 3: " + nunC3);
        System.out.println("double 1: " + nun_doubleC1);
        System.out.println("double 2: " + nun_doubleC2);
        System.out.println("double 3: " + nun_doubleC3);
    }

    public void mostrar_atb_super () {
        super.mostrar_atb_super();
        System.out.println("nome 3: " + nomeC3);
        System.out.println("int 3: " + nunC3);
        System.out.println("double 3: " + nun_doubleC3);
    }
}
