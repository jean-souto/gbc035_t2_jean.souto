public class ex02 {
    public static void main (String[] args) {
        setor setores = new setor(("Calçados"), ("Tênis"), (150));
        loja loja = new loja(("Socorro"), ("Geral"), (setores));

        System.out.println("Mostrando tudo completo: \n");
        loja.mostrarLoja();

        System.out.println("\nLoja sem setor: ");
        loja.apagarSetor();
        loja.mostrarLoja();
    }
}
