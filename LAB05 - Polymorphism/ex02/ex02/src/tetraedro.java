public class tetraedro extends formaTridimensional {
    double aresta;
    double altura;
    double area;
    double volume;

    public tetraedro () {
    }

    public tetraedro(double aresta, double altura, int arestas) {
        super(arestas);
        this.aresta = aresta;
        this.altura = altura;
        this.area = 0;
        this.volume = 0;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double obterArea () {
        area = (aresta*aresta)*Math.sqrt(3);
        return area;
    }

    public double obterVolume () {
        volume = (((aresta*aresta*aresta)*Math.sqrt(2))/12);
        return volume;
    }

    public void mostrar () {
        System.out.println("Mostrando tetraedro: ");
        System.out.println("Número arestas: " + nun_arestas);
        System.out.println("Altura: " + altura);
        System.out.println("Aresta: " + aresta);
        obterArea();
        System.out.println("Área: " + area);
        obterVolume();
        System.out.println("Volume: " + volume);
    }
}