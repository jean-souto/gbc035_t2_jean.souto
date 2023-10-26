import java.lang.Math;

public class esfera extends formaTridimensional {
    protected double raio;
    protected double area;
    protected double volume;

    public esfera () {
    }

    public esfera(double raio, int arestas) {
        super(arestas);
        this.raio = raio;
        this.area = 0;
        this.volume = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterArea () {
        area = 4*(Math.PI*(raio*raio));
        return area;
    }

    public double obterVolume () {
        volume = ((double) 4/3)*(Math.PI*(raio*raio*raio));
        return volume;
    }
    public void mostrar () {
        System.out.println("Mostrando esfera: ");
        System.out.println("Número arestas: " + nun_arestas);
        System.out.println("Raio: " + raio);
        obterArea();
        System.out.println("Área: " + area);
        obterVolume();
        System.out.println("Volume: " + volume);
    }
}