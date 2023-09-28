public class camaroteSuperior extends ingressoVIP {
    private String local;

    public camaroteSuperior () {
    }

    public camaroteSuperior (String local, double valor, double adicionalVIP, double adicionalSuperior) {
        this.local = local;
        this.valor = valor+adicionalVIP+adicionalSuperior;
    }

    public double retornaValorCam () {
        return valor;
    }

    public String retornaLocalCam () {
        return local;
    }

    public void mostrarLocalCam () {
        System.out.println("O seu local no camarote superior é: " + local);
    }

    public void alterarLocal (String lcoal) {
        this.local = local;
    }
}
