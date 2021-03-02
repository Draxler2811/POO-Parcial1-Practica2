/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Figura2 {
    Scanner sc = new Scanner(System.in);
    private int n;
    
    public Figura2(){
        System.out.println("Piramide ");
    }
    
    public void Entrada(){
        System.out.println("Numero de Filas: ");
        n=sc.nextInt();
        int i=0;
        while(i<n){
            i++;
            int j=n-i;
            while(j>0){
            j--;
            System.out.print(" ");
            }
        int k=0;
        while(k<i){
        k++;
        System.out.print(" *");
        }
        System.out.println("");
        }
    }
}
