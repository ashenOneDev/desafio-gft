package gft.dio;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Cachorro pet = new Cachorro("Vira Lata", "pequeno", 76);
        
        Pessoa pessoa = new Pessoa("Carlos", 25, pet);

        System.out.println("Diferença entre as idades: " + pessoa.diferencaEntreIdades() + " anos");
        System.out.println("Idade humana do pet: " + pet.porteCachorro(pet.getPorte()) + " anos");
        

        
    }
}
