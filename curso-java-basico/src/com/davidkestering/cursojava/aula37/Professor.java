package com.davidkestering.cursojava.aula37;

/**
 * Created by seduc on 11/05/2016.
 */
public class Professor extends Pessoa {
    private String curso;
    private double salario;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

}
