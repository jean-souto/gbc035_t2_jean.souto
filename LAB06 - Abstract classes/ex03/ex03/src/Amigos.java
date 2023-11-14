public class Amigos extends Contato {
    protected String grau;

    public Amigos () {
    }

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        switch (grau) {
            case 1:
                this.grau = "melhor amigo";
                break;

            case 2:
                this.grau ="amigo";
                break;

            case 3:
                this.grau = "conhecido";
                break;

            default:
                this.grau = "desconhecido";
        }
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Grau: " + grau);
    }
}
