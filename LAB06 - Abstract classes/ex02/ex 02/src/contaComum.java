public class contaComum extends contaCorrente{

    private double limiteEspecial;
    public contaComum () {
    }
    public contaComum(float val, int num, int pwd) {
        super(val, num, pwd);
        limiteEspecial = 0;
    }
}
