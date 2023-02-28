package org.example;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        /*
        //AULA 2 VARIÁVEIS PRIMITIVAS

        double saldo_da_conta;

        System.out.println("Hello Word");

        double numDouble;
        float numFloat;

        Scanner entrada = new Scanner(System.in);
        double numDouble = entrada.nextDouble();

        int numInt = entrada.nextInt();

        float numFloat = entrada.nextFloat();

        entrada.nextLine();
        String nome = entrada.nextLine();
        */

        float peso;
        float altura;
        float imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o seu peso(kg)");
        peso = entrada.nextFloat();
        System.out.println("Entre com a sua altura(m)");
        altura = entrada.nextFloat();

        imc = (float) (peso/Math.pow(altura, 2));

        if(imc < 18.5) {
            System.out.println("Abaixo do Peso");
        }
        else if(imc < 24.9) {
            System.out.println("Peso Normal");
        }
        else if(imc < 29.9) {
            System.out.println("Sobrepeso");
        }
        else if(imc < 34.9) {
            System.out.println("Obesidade grau 1");
        }
        else if(imc < 39.9) {
            System.out.println("Obesidade grau 2");
        }
        else {
            System.out.println("Obesidade grau 3 ou Mórbida");
        }








    }
}
