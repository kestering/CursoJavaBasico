package com.davidkestering.cursojava.aula19exercicios;

import java.util.Scanner;

/**
 * Created by davidkestering on 22/04/16.
 */
public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 5 numeros.");
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i]);
        }

        System.out.print("\nVetor B = ");
        for (int i=0;i<vetorA.length;i++){
            System.out.print(vetorB[i]);
        }

    }
}
