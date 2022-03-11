/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class Berhitung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers1, numbers2, result= 0, hasil=0;
        char operasi;
        // input data 1
        numbers1 = scan.nextInt();
        // Pilihan Operasi
        operasi = scan.next().charAt(0);
        // input data 2
        numbers2 = scan.nextInt();
        
        if(1000>=numbers1 && numbers1>=1){
            if(1000>=numbers2 && numbers1>=1){
                if(operasi=='+'){
                    hasil=numbers1+numbers2;
                } else if(operasi=='-'){
                    hasil=numbers1-numbers2;
                } else if(operasi=='*'){
                    hasil=numbers1*numbers2;
                } else if(operasi=='/'){
                    if(numbers1%numbers2==0){
                        hasil=numbers1/numbers2;
                    }
                    else{
                        System.out.println("Bilangan A tidak habis dibagi ");
                    }
                } else if(operasi=='%'){
                    hasil=numbers1%numbers2;
                } else{
                    System.out.println("Operator tidak tersedia");
                }
            }
        }
        System.out.println(hasil);
    
    }
}
