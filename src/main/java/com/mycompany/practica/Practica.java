/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica;

import java.util.Scanner;

/**
 *
 * @author Juano
 */
public class Practica {

    public static void main(String[] args) {

        var arreglo1 = new Arreglo();

        var vector1 = arreglo1.crearVector(3);
        System.out.println("Vector 1: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        var arreglo2 = new Arreglo();
        System.out.print("\n");
        var vector2 = arreglo2.crearVector(3);
        System.out.println("Vector 2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.print("\n");
        var arreglo3 = new Arreglo();
        var vectorSumado = arreglo3.sumaVector(vector1, vector2);
        System.out.println("El vector resultante es: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vectorSumado[i] + " ");
        }
        System.out.print("\n");
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo4.crearMatriz(2, 2);
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                System.out.print(matriz1[i][j] + " ");
            }
            System.out.print("\n");
        }
        var arreglo5 = new Arreglo();
        System.out.print("\n");
        
        var matriz2 = arreglo5.crearMatriz(2, 2);
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.print("\n");
        }
        var arreglo6 = new Arreglo();
        var matrizSumada = arreglo6.sumaMatriz(matriz1, matriz2);
        System.out.println("\nLa matriz resultante es:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matrizSumada[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
