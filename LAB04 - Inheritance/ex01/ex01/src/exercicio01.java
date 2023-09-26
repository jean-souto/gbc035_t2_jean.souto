public class exercicio01 {
    public static void main (String[] args) {
        figurinhas figurinha1 = new figurinhas(("Jorge"), ("10/10/2001"), ("Goleiro"), ("Brasil"), (1.75), (70.5));
        figurinha_extra figurinha2 = new figurinha_extra(("Caio"), ("15/07/2000"), ("Meio"), ("Canadá"), (1.95), (78.8), ("hookie"), ("ouro"));

        System.out.println("Mostrando fig 1: ");
        figurinha1.mostrar_fig();

        System.out.println("\nMostrando fig 2");
        figurinha2.mostrar_fig_extra();
    }
}
