public class ex01 {
    public static void main (String[] args) {
        acessorio Acessorio = new acessorio(("Anel"), ("Joias"), (1500));
        pessoa Adulto = new pessoa(("Jorge"), ("Programador"), (23), (Acessorio));

        System.out.println("Nome: " + Adulto.getNome());
        System.out.println("Idade: " + Adulto.getIdade());
        System.out.println("Profissão: " + Adulto.getProfissao());
        System.out.println("Acessório: ");
        Adulto.showAcessorio();

        System.out.println("\nMostrando acessório independente da pessoa: ");
        Acessorio.mostrarAcessorio();

        System.out.println("\nMostrando pessoa independente de acessório: ");
        Adulto.showPessoa();
    }
}
