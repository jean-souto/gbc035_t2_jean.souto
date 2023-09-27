public class exercicio03 {
    public static void main (String[] args) {

        figurinha figurinha1 = new figurinha(("Jorge"), ("10/10/2001"), ("Goleiro"), ("Brasil"), (1.75), (70.5));
        figurinha figurinha3 = new figurinha(("João"), ("04/08/1998"), ("Defensor"), ("Argentina"), (1.78), (87.2));
        figurinha_extra figurinha2 = new figurinha_extra(("Caio"), ("15/07/2000"), ("Meio"), ("Canadá"), (1.95), (78.8), ("hookie"), ("ouro"));
        figurinha_extra figurinha4 = new figurinha_extra((figurinha3), ("legend"), ("prata"));

        System.out.println("Mostrando fig 1: ");
        figurinha1.mostrar_fig();

        System.out.println("\nMostrando fig 2:");
        figurinha2.mostrar_fig();

        System.out.println("\nMostrando fig 3:");
        figurinha3.mostrar_fig();

        System.out.println("\nMostrando fig 4:");
        figurinha4.mostrar_fig();
    }
}