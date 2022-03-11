/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class gajiAgent {
    public static void main(String[] args) {
        long gajiPokok=500000,gaji, bonus, pengurangan=0,gajiAkhir=0, jmlPenjualan;
        int penjualan,kurang;
        Scanner scan = new Scanner(System.in);
 
        penjualan = scan.nextInt();
        jmlPenjualan = 50000*penjualan;
        if(penjualan>80){
            gaji = (long) (0.35*jmlPenjualan);
            gajiAkhir = gajiPokok+gaji;
        } else if(penjualan>=40){
            gaji=(long) (0.25*jmlPenjualan);
            gajiAkhir = gajiPokok+gaji;
        } else if(penjualan<=15){
            kurang=(15-penjualan)*50000;
            pengurangan = (long) (0.15*kurang);
            
            gajiAkhir = gajiPokok-pengurangan;
        } else{
            bonus = 5000*penjualan;
            gajiAkhir=gajiPokok+bonus;
        }
        
        System.out.println(gajiAkhir);
    }
    
}
