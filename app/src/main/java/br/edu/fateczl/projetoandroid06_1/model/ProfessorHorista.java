package br.edu.fateczl.projetoandroid06_1.model;

public class ProfessorHorista extends Professor {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private int horasAula;
    private double valorHoraAula;


    public ProfessorHorista(int horasAula, double valorHoraAula) {
        this.horasAula = horasAula;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calcSalario() {
        return valorHoraAula * horasAula;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
