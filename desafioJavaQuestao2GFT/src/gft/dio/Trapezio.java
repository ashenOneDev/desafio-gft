package gft.dio;

public class Trapezio implements CalculoGerais {
    private float area;
    private float baseMaior;
    private float baseMenor;
    private float h;

    public Trapezio(float baseMaior, float baseMenor, float h) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.h = h;
    }

    @Override
    public void calculoDeArea() {
        this.setArea(((this.getBaseMaior() + this.getBaseMenor()) * this.getH()) / 2);
        System.out.println(String.format("A = %.2f",this.getArea()));
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
