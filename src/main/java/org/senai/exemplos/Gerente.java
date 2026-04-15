package org.senai.exemplos;

public class Gerente extends Funcionario {
    private double bonusExtra;

    public Gerente(String nome, double salario, double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }


    @Override
    public double calcularBonus(double percentual) {

        return salario + (salario / percentual) + bonusExtra;
    }

    public void mostrarBonus() {
        System.out.println("Bônus extra: " + bonusExtra);
    }


}
