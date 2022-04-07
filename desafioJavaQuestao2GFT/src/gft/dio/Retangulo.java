package gft.dio;

public class Retangulo implements CalculoGerais {
    private float area;
    private float b;
    private float h;

    public Retangulo(float b, float h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public void calculoDeArea() {
        this.setArea((this.getB() * this.getH()));
        System.out.println(String.format("A = %.2f",this.getArea()));
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
