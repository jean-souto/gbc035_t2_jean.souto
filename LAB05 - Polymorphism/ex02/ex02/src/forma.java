public class forma {
    protected int nun_arestas;

    public forma () {
    }

    public forma(int nun_arestas) {
        this.nun_arestas = nun_arestas;
    }

    public int getNun_arestas() {
        return nun_arestas;
    }

    public void setNun_arestas(int nun_arestas) {
        this.nun_arestas = nun_arestas;
    }

    public void mostrar () {
        System.out.println("Mostrando forma básica: ");
        System.out.println("Número de arestas: " + nun_arestas);
    }
}
