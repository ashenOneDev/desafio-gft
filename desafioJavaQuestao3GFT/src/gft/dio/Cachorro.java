package gft.dio;

public class Cachorro {
    protected String raca;
    protected String porte;
    protected int idade;

    public Cachorro(String raca, String porte, int idade) {
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    public int porteCachorro(String porte) {
        if (this.getPorte() == "pequeno") {
            switch (this.idade){
                case 15:
                    return 1;
                case 24:
                    return 2;
                case 28:
                    return 3;
                case 32:
                    return 4;
                case 36:
                    return 5;
                case 40:
                    return 6;
                case 48:
                    return 7;
                case 52:
                    return 8;

            }

        } else if (this.getPorte() == "medio") {
            switch (this.idade){
                case 15:
                    return 1;
                case 28:
                    return 2;
                case 32:
                    return 3;
                case 36:
                    return 4;
                case 42:
                    return 5;
                case 47:
                    return 6;
                case 51:
                    return 7;
                case 56:
                    return 8;

            }

        } else {
            switch (this.idade){
                case 15:
                    return 1;
                case 24:
                    return 2;
                case 28:
                    return 3;
                case 32:
                    return 4;
                case 36:
                    return 5;
                case 45:
                    return 6;
                case 50:
                    return 7;
                case 55:
                    return 8;

            }

        }
        return 0;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
