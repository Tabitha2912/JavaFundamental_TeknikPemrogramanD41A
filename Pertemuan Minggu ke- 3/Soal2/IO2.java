/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class IO2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i<3; i++) {
                String s1 = scan.next();
                int x = scan.nextInt();
                System.out.format("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
    }
}
