package gft.dio;

public class Quadrado implements CalculoGerais {
    private float area;
    private float L;

    public Quadrado(float l) {
        L = l;
    }

    @Override
    public void calculoDeArea() {
        this.setArea(this.getL() * this.getL());
        System.out.println(String.format("A = %.2f",this.getArea()));
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getL() {
        return L;
    }

    public void setL(float l) {
        L = l;
    }
}
