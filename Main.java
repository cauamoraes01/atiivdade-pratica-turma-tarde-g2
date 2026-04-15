package org.senai.exemplos;


public class Main {
    public static void main(String[] args) {
        Gerente func1 = new Gerente("Robson", 1621,20);

        func1.mostrarBonus();
        func1.calcularBonus(20);
        System.out.print("| Valor a receber: " + func1.calcularBonus(20));

    }
}