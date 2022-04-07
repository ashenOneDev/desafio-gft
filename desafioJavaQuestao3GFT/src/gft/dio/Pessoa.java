package gft.dio;

import static java.lang.Math.abs;

public class Pessoa {
    protected String nomePessoa;
    protected int idadePessoa;
    protected Cachorro pet;

    public Pessoa(String nomePessoa, int idadePessoa, Cachorro pet) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.pet = pet;
    }

    public int diferencaEntreIdades() {
        return abs(this.getIdadePessoa() - this.pet.getPorte());

    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public Cachorro getPet() {
        return pet;
    }

    public void setPet(Cachorro pet) {
        this.pet = pet;
    }
}
