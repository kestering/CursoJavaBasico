package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 10 numeros.");
        int[] vetorA = new int[10];
        int qtdPar = 0;
        int qtdImpar = 0;
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i]%2!=0)
                qtdImpar++;
            else
                qtdPar++;
        }
        double porcPar = (100*qtdPar)/vetorA.length;
        double porcImpar = (100*qtdImpar)/vetorA.length;
        System.out.print("A porcentagem de pares é de "+porcPar+"%, de impares de "+porcImpar+"%.");
    }
}
