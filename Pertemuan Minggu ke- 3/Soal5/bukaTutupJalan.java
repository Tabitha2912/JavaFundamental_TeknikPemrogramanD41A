/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class bukaTutupJalan {
    public static void main(String[] args) {
        int[] platNomor = new int[4];
        int i;
        String str;
        long platNomorGabungan;
        
        Scanner scan = new Scanner(System.in);
        
        for(i=0;i<platNomor.length;i++){
            platNomor[i] = scan.nextInt();
        }
        
        str = Arrays.toString(platNomor).replaceAll("\\[|\\]|,|\\s","");
        platNomorGabungan = Long.parseLong(str);
        
        if((platNomorGabungan-999999) % 5 == 0){
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
    }
}
