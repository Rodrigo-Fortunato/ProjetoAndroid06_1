package br.edu.fateczl.projetoandroid06_1.model;

public abstract class Professor {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private String nome;
    private String matricula;
    private int idade;


    public Professor() {

    }

    public abstract double calcSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
