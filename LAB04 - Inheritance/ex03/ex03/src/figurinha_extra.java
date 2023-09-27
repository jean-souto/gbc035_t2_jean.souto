import java.util.Objects;

public class figurinha_extra extends figurinha {
    private String tipo;
    private String cor;

    public figurinha_extra (String nome, String nasc, String position, String country, double altura, double peso, String tipo, String cor) {
        super((nome), (nasc), (position), (country), (altura), (peso));

        if (!Objects.equals(tipo, ("legend")) && !Objects.equals(tipo, ("hookie"))) {
            this.tipo = null;
        } else {
            this.tipo = tipo;
        }

        if (!Objects.equals(cor, ("bordô")) && !Objects.equals(cor, ("bronze")) && !Objects.equals(cor, ("prata")) && !Objects.equals(cor, ("ouro"))) {
            this.cor = null;
        } else {
            this.cor = cor;
        }
    }

    public figurinha_extra (figurinha fig, String tipo, String cor) {
        super(fig.getNome(), fig.getNasc(), fig.getPosition(), fig.getCountry(), fig.getAltura(), fig.getPeso());

        if (!Objects.equals(tipo, ("legend")) && !Objects.equals(tipo, ("hookie"))) {
            this.tipo = null;
        } else {
            this.tipo = tipo;
        }

        if (!Objects.equals(cor, ("bordô")) && !Objects.equals(cor, ("bronze")) && !Objects.equals(cor, ("prata")) && !Objects.equals(cor, ("ouro"))) {
            this.cor = null;
        } else {
            this.cor = cor;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrar_fig () {
        super.mostrar_fig();
        System.out.println("Classe: " + tipo);
        System.out.println("Cor: " + cor);
    }
}