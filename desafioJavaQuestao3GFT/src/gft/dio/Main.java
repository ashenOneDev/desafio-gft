package gft.dio;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Cachorro pet = new Cachorro("Vira Lata", "pequeno", 24);
        
        Pessoa pessoa = new Pessoa("Carlos", 25, pet);

        System.out.println("Diferença entre as idades: " + pessoa.diferencaEntreIdades());        
        

        
    }
}
