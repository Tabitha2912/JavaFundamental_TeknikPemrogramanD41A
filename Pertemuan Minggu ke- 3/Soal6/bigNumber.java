/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal6;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class bigNumber {
    public static void main(String[] args) {
        int angka1, angka2, tambah;
        long kali;
        Scanner scan = new Scanner(System.in);
        
        angka1 = scan.nextInt();
        angka2 = scan.nextInt();
        
        tambah= angka1+angka2;
        kali= angka1*angka2;
        
        System.out.println(tambah);
        System.out.println(kali);
    }
}
