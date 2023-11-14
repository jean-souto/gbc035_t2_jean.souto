public class cubo extends formaTridimensional {
    protected double lado;
    protected double area;
    protected double volume;

    public cubo () {
    }

    public cubo(double lado, int arestas) {
        super(arestas);
        this.lado = lado;
        this.area = 0;
        this.volume = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double obterArea () {
        area = 6*(lado*lado);
        return area;
    }

    public double obterVolume () {
        volume = (lado*lado*lado);
        return volume;
    }

    public void mostrar () {
        System.out.println("Mostrando cubo: ");
        System.out.println("Número arestas: " + nun_arestas);
        System.out.println("Lado: " + lado);
        obterArea();
        System.out.println("Área: " + area);
        obterVolume();
        System.out.println("Volume: " + volume);
    }
}