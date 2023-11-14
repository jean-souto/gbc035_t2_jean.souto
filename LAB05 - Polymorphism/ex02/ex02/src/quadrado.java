public class quadrado extends formaBidimensional {
    protected double lado;
    protected double area;

    public quadrado () {
    }

    public quadrado (double lado, int arestas) {
        super(arestas);
        this.lado = lado;
        this.area = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double obterArea () {
        area = lado*lado;
        return area;
    }

    public void mostrar () {
        System.out.println("Mostrando quadrado: ");
        System.out.println("Número arestas: " + nun_arestas);
        System.out.println("Lado: " + lado);
        obterArea();
        System.out.println("Área: " + area);
    }
}