import java.lang.Math;

public class circulo extends formaBidimensional {
    protected double raio;
    protected double area;

    public circulo () {
        super();
    }

    public circulo(int arestas, double raio) {
        super(arestas);
        this.raio = raio;
        this.area = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double obterArea () {
        area = Math.PI*(raio*raio);
        return area;
    }

    public void mostrar () {
        System.out.println("Mostrando circulo: ");
        System.out.println("Número arestas: " + nun_arestas);
        obterArea();
        System.out.println("Área: " + area);
        System.out.println("Raio: " + raio);
    }
}