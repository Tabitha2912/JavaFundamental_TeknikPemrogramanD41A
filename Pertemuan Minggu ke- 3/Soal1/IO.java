/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Sasa
 */
public class IO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
         
        //split string by multiple delimiters   
        String[] stringarray = s.split("[!,?._'@ ]");   
        //iterate over string array  
        System.out.println(stringarray.length); 
        for(int i=0; i< stringarray.length; i++)  
        {  
            //prints the tokens  
            System.out.println(stringarray[i]);  
        }  
    }
}

