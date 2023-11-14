public class triangulo extends formaBidimensional {
    protected double base;
    protected double altura;
    protected double area;

    public triangulo () {
    }

    public triangulo(double base, double altura, int arestas) {
        super(arestas);
        this.base = base;
        this.altura = altura;
        this.area = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double obterArea () {
        area = (base*altura)/2;
        return area;
    }

    public void mostrar () {
        System.out.println("Mostrando triangulo: ");
        System.out.println("Número arestas: " + nun_arestas);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        obterArea();
        System.out.println("Área: " + area);
    }
}