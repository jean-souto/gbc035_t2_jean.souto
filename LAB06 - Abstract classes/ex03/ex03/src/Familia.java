public class Familia extends Contato {
    protected String parentesco;

    public Familia() {
    }

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void imprimirContato () {
        imprimirBasico();
        System.out.println("Parentesco: " + parentesco);
    }
}
