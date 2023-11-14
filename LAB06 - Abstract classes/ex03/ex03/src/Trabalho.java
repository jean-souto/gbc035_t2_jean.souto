public class Trabalho extends Contato {
    protected String tipo;

    public Trabalho () {
    }

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Tipo: " + tipo);
    }
}
