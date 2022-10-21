/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

import java.util.Scanner;

/**
 *
 * @author Juano
 */
public class Arreglo {
   public int[] crearVector(int f) {
        var retorno = new int[f];
        var lectura = new Scanner(System.in);
        for (int i = 0; i < f ; i++){
            System.out.println("Ingrese el valor de la posicion "+(i));
            retorno[i] = lectura.nextInt();
        }
        return retorno;
    }

    public int[][] crearMatriz(int f, int c) {
        var retorno = new int[f][c];
        var lectura = new Scanner(System.in);
        for (int i = 0; i < f ; i++){
        for (int j = 0; j < f ; j++){
        System.out.println("Ingrese el valor de la posicion[" + (i) + "]" + "[" + (j) + "]");
            retorno[i][j] = lectura.nextInt();
        }
        }
        
        return retorno;
    }

    public int[] sumaVector(int[] v1, int[] v2) {
        var retorno = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            retorno[i] = v1[i] + v2[i];
        }
        return retorno;
    }

    public int[][] sumaMatriz(int[][] m1, int[][] m2) {
        var retorno = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                retorno[i][j] = m1[i][j] + m2[i][j];

            }
        }
        return retorno;
    }
}
