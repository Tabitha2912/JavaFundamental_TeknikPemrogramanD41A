/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class Soal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        double angka;
        long min,max;
        min=-9223372036854775808L;
        max=9223372036854775807L;
        
        for(i=0;i<5;i++){
            
            angka = input.nextDouble();
            System.out.println("");
            
            if(angka>-128 && angka<127){
                System.out.println(angka+" can be fitted in");
                System.out.println("*Byte");
                System.out.println("*Short");
                System.out.println("*Int");
                System.out.println("*Long");
            }
            else if(angka>-32768 && angka<32767){
                System.out.println(angka+" can be fitted in");
                System.out.println("*Short");
                System.out.println("*Int");
                System.out.println("*Long");
            }
            else if(angka>-2147483648 && angka<2147483647){
                System.out.println(angka+" can be fitted in");
                System.out.println("*int");
                System.out.println("*Long");
            }
            else if(angka<max && angka>min){
                System.out.println(angka+" can be fitted in");
                System.out.println("*Long");
            }
            else{
                System.out.println((long)angka+" can't be fitted in:");
            }
        }
            
        }
    
}
