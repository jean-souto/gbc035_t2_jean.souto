public class Universidade {
    private String nome;
    private String data_fund;
    private Estudante []alunosUniv = new Estudante[100];
    private int tamanho = -1;

    public Universidade () {
    }

    public Universidade (String nome, String data_fund) {
        this.nome = nome;
        this.data_fund = data_fund;
    }

    public void quantEstudantes () {
        int grad = 0, posgrad = 0, mestr = 0, doc = 0;

        for (int i = 0; i < tamanho; i++) {
            if (alunosUniv[i] instanceof EstudanteGraduacao) {
                grad++;
            } else if (alunosUniv[i] instanceof EstudantePosGrad) {
                posgrad++;
            } else if (alunosUniv[i] instanceof EstudanteMestrado) {
                mestr++;
            } else {
                doc++;
            }
        }

        System.out.println("Graduação: " + grad);
        System.out.println("Pós Graduação: " + posgrad);
        System.out.println("Mestrado: " + mestr);
        System.out.println("Doutorado: " + doc);
    }

    public void mostrarAlunos () {
        int grad = 0, mestr = 0, doc = 0;

        for (int i = 0; i <= tamanho; i++) {
            alunosUniv[i].mostrarAlunos();
            if (alunosUniv[i] instanceof EstudanteGraduacao) {
                grad++;
            } else if (alunosUniv[i] instanceof EstudanteMestrado) {
                mestr++;
            } else {
                doc++;
            }
        }

        System.out.println("Total de alunos: " + (tamanho+1));
        System.out.println("Graduação: " + grad);
        System.out.println("Mestrado: " + mestr);
        System.out.println("Doutorado: " + doc);
    }

    public void newGrad (String nome, String endereco, String tituloTCC) {
        tamanho++;
        alunosUniv[tamanho] = new EstudanteGraduacao(nome, endereco, tituloTCC);
    }

    public void newMestr (String nome, String endereco, String formacao, String linhadepesquisa, String tipo, String titulodissert) {
        tamanho++;
        alunosUniv[tamanho] = new EstudanteMestrado(nome, endereco, formacao, linhadepesquisa, tipo, titulodissert);
    }

    public void newDout (String nome, String endereco, String formacao, String linhadepesquisa, String titulotese) {
        tamanho++;
        alunosUniv[tamanho] = new EstudanteDoutorado(nome, endereco, formacao, linhadepesquisa, titulotese);
    }

}
