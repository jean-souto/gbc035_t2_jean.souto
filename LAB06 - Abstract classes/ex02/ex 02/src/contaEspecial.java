public class contaEspecial extends contaCorrente{
    private double limiteEspecial;

    public contaEspecial () {
    }

    public contaEspecial(float val, int num, int pwd, double limiteEspecial) {
        super(val, num, pwd);
        this.limiteEspecial = limiteEspecial;
    }

    public contaComum transformaComum () {
        return new contaComum(saldo, numConta, senha);
    }

    public boolean debitaValor ( float val , int pwd ) {
        if ( pwd != senha )
            return ( false ); // senha deve ser vá lida
        if ( estado != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > saldo )
            return ( false );

        saldo -= val ;
        if ( saldo == 0 && limiteEspecial == 0)
            estado = 2; // torna conta inativa
        return ( true ) ;
    }
}
