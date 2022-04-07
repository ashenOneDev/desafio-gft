package gft.dio;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2 , 3);
        System.out.print("Triangulo: ");
        triangulo.calculoDeArea();

        Quadrado quadrado = new Quadrado(2);
        System.out.print("Quadrado: ");
        quadrado.calculoDeArea();

        Retangulo retangulo = new Retangulo(2, 4);
        System.out.print("Retangulo: ");
        retangulo.calculoDeArea();

        Trapezio trapezio = new Trapezio(4, 2, 3);
        System.out.print("Trapezio: ");
        trapezio.calculoDeArea();

    }
}
