package gft.dio;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        TesteMDC teste = new TesteMDC();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 3 e 999: ");
        int numero = leitor.nextInt();

        for (int i = 3; i <= numero; i ++) {
            int x = teste.mdc(i, numero);
            if (x == 1) {
                System.out.println(i + " e " + numero + " são primos entre si!" );
            } else {
                System.out.println(i + " e " + numero + " não são primos entre si!" );
            }
        }

    }


}
