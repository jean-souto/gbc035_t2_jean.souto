public class banco {
    public static void main (String[] args) {
        contaEspecial contaUm = new contaEspecial(1000, 123, 1258, 0);
        contaEspecial contaDois = new contaEspecial(5000, 456, 9854, 200);
        contaEspecial contaTres = new contaEspecial(500, 789, 9632, 200);

        contaUm.debitaValor(900, 1258);
        System.out.println("Saldo conta um: " + contaUm.getSaldo(1258));
        contaUm.debitaValor(200, 1258);
        System.out.println("Estado da conta um: " + contaUm.getEstado(1258));
    }
}
