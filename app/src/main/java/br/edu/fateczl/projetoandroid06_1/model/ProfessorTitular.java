package br.edu.fateczl.projetoandroid06_1.model;

public class ProfessorTitular extends Professor{
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */

    private int anosInstituicao;
    private double salario;

    public ProfessorTitular(int anosInstituicao, double salario) {
        this.anosInstituicao = anosInstituicao;
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        return salario * (1+(anosInstituicao*0.05));
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
