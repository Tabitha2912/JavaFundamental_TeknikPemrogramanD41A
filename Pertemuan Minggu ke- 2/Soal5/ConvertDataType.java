/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author Sasa
 */
public class ConvertDataType {
    static short methodOne(long l)
    {
        
        int i = (int) l;
        System.out.println("Nilai i  (int) : "+i);
        System.out.println("Nilai i (short) : "+(short)i);
        return (short)i;
        
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        System.out.println("Nilai i (double) : "+d);
        float f = (float) d;
        System.out.println("Nilai i (float) : "+f);
        System.out.println("Nilai i  (long) : "+(long)f);
        byte b = (byte) methodOne((long) f);
        System.out.println("Nilai i (byte) :"+b);
    }

}
