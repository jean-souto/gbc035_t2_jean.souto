public class ingressoVIP extends ingresso {
    protected double valorAdicional;

    public ingressoVIP () {
    }

    public ingressoVIP (double valor, double adicional) {
        this.valor = valor+adicional;
    }

    public void valorVIP (double valor, double valorAdicional) {
        this.valor = valor+valorAdicional;
    }

    public double retornaValorVIP () {
        return valor;
    }
}
