public class ex03 {
    public static void main (String[] args) {
        setor setores = new setor(("Calçados"), ("Tênis"), (150));
        loja loja = new loja(("Lourdes Lojas"), ("Geral"), (setores));

        setores.limparSetor();

        System.out.println("Loja: \n");
        loja.mostrarLoja();

        System.out.println("\n\nApagando loja e mostrando que não há setor sem loja: \n");
        loja.apagarLoja();
        loja.mostrarLoja();
    }
}
