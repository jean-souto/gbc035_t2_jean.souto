public class ex03 {
    public static void main (String[] args) {
        loja loja = new loja(("Lourdes Lojas"), ("Geral"), ("Calçados"), (150), ("Tênis"));

        System.out.println("Loja: \n");
        loja.mostrarLoja();

        System.out.println("\n\nApagando loja e mostrando que não há setor sem loja: \n");
        loja.apagarLoja();
        loja.mostrarLoja();
    }
}
