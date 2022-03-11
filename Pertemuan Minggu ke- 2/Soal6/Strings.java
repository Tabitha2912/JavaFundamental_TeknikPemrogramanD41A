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
public class Strings {
    public static void main(String[] args) {
        String kataDepan, kataBelakang;
        int jml;
        Scanner keyboard = new Scanner(System.in);

        kataDepan = keyboard.nextLine();
        kataBelakang = keyboard.nextLine();
        
        jml=kataDepan.length()+kataBelakang.length();
        System.out.println("\n"+jml);
        
        if(kataDepan.compareTo(kataBelakang)<0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        String kataDepan2 = kataDepan.substring(0, 1).toUpperCase() + kataDepan.substring(1);
        String kataBelakang2 = kataBelakang.substring(0, 1).toUpperCase() + kataBelakang.substring(1);
        System.out.println(kataDepan2+" "+kataBelakang2);
        
        
    }
}
