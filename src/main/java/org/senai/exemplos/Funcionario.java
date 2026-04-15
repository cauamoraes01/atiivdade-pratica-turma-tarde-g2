package org.senai.exemplos;


public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(double percentual) {

        return salario + (salario * percentual);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
    }
}
