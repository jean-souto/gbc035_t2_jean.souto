public class camaroteInferior extends ingressoVIP{
    private String local;

    public camaroteInferior () {
    }

    public camaroteInferior (String local, double valor, double adicionalVIP) {
        this.local = local;
        this.valor = valor+adicionalVIP;
    }

    public double retornaValorCamarote () {
        return valor;
    }

    public String retornaLocalCam () {
        return local;
    }

    public void mostrarLocalCam () {
        System.out.println("O seu local no camarote é: " + local);
    }

    public void alterarLocal (String lcoal) {
        this.local = local;
    }
}
