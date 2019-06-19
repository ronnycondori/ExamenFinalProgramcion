/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examenfinalprogramcionmaven;

import java.util.Scanner;

/**
 *
 * @author RONNY
 */
public class ExamenRonnyCY {
    
    public int[][] Ejercicio6RonnyCY(int dimen, int numInit){
        System.out.println("Ejercicio 6: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {

                    if (j < i + 1){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }   
                }
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio9RonnyCY(int dimen, int numInit){
        System.out.println("Ejercicio 9: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    
                    if(j >= dimen - (i + 1)){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio12RonnyCY(int dimen, int numInit){
        System.out.println("Ejercicio 12: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j >= i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio26RonnyCY(int dimen, int numInit){
        System.out.println("Ejercicio 26: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i ++) {
                if(contador % 2 == 0){
                    for(int j = matriz[0].length - 1; j >= 0; j--) { 
                        matriz[i][j] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio30RonnyCY(int dimen, int numInit){
        System.out.println("Ejercicio 30: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = c; ldS < dimen - c - 1; ldS++) {
                    matriz[ldS][dimen - 1 - c] = numInit++;   
                }
                for(int fil = dimen - c - 1; fil > c; fil--) {
                    matriz[dimen - 1 - c][fil] = numInit++;
                }
                for(int col = dimen - c - 1; col > c; col--) {
                    matriz[col][c] = numInit++;
                }
                for(int ldI = c; ldI < dimen - c - 1; ldI++) {
                    matriz[c][ldI] = numInit++;
                }
            }
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }
        return matriz;
    }
    
    public void imprimir(int[][] matriz){
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        ExamenRonnyCY or = new ExamenRonnyCY();
        System.out.println("Ingrese la dimencion para iniciar la matriz: ");
        int din = o.nextInt();
        System.out.println("Ingrese el numero de inicio para la matriz: ");
        int ini = o.nextInt();
        System.out.println("\n");
            or.imprimir(or.Ejercicio6RonnyCY(din, ini));
            or.imprimir(or.Ejercicio9RonnyCY(din, ini));
            or.imprimir(or.Ejercicio12RonnyCY(din, ini));
            or.imprimir(or.Ejercicio26RonnyCY(din, ini));
            or.imprimir(or.Ejercicio30RonnyCY(din, ini));
    }        
}
    
