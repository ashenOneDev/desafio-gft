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
                case 44:
                    return 7;
                case 48:
                    return 8;
                case 52:
                    return 9;
                case 56:
                    return 10;
                case 60:
                    return 11;
                case 64:
                    return 12;
                case 68:
                    return 13;
                case 72:
                    return 14;
                case 76:
                    return 15;

            }
        } else if (this.getPorte() == "medio") {
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
                case 42:
                    return 6;
                case 47:
                    return 7;
                case 51:
                    return 8;
                case 56:
                    return 9;
                case 60:
                    return 10;
                case 65:
                    return 11;
                case 69:
                    return 12;
                case 74:
                    return 13;
                case 78:
                    return 14;
                case 83:
                    return 15;

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
                case 61:
                    return 9;
                case 66:
                    return 10;
                case 72:
                    return 11;
                case 77:
                    return 12;
                case 82:
                    return 13;
                case 88:
                    return 14;
                case 93:
                    return 15;

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
