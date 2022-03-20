/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sasa
 */
public class MainProgram {
    public static void main (String[] args)
    {
        // Creating the Objects of Book class.
        Rumah r1 = new Rumah("A", 128);
        Rumah r2 = new Rumah("C", 79);
        Rumah r3 = new Rumah("G", 256);
        // Creating the list which contains the
        // no. of books.
        List<Rumah> rumah = new ArrayList<Rumah>();
        rumah.add(r1);
        rumah.add(r2);
        rumah.add(r3);
        Komplek komplek = new Komplek(rumah);
        List<Rumah> rmh = komplek.getTotalRumahDiKomlek();
        for(Rumah rm : rmh){
            System.out.println("Blok : " + rm.blok + " dan "
            +" Nomor rumah : " + rm.nomor);
        }
    }
}
