/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sasa
 */
public class mainProgram {
    public static void main (String[] args)
    {
        City c1 = new City("Bandung", 1810, "Jawa Barat");
        City c2 = new City("Yogyakarta", 1755, "Jawa Tengah");
        City c3 = new City("Jakarta", 1527, "DKI Jakarta");
        City c4 = new City("Cimahi", 1962, "Jawa Barat");
        // making a List of
        // CSE Students.
        List <City> cse_city = new ArrayList<City>();
        cse_city.add(c1);
        cse_city.add(c2);
        // making a List of
        // EE Students
        List <City> ee_city = new ArrayList<City>();
        ee_city.add(c3);
        ee_city.add(c4);
        Province CSE = new Province("CSE", cse_city);
        Province EE = new Province("EE", ee_city);
        List <Province> province = new ArrayList<Province>();
        province.add(CSE);
        province.add(EE);
        // creating an instance of Institute.
        State state = new State("BITS",province);
        System.out.print("Total city in state: ");
        System.out.println(state.getTotalCityInState());
        
        c1.tampil();
        c2.tampil();
        c3.tampil();
        c4.tampil();
    }
}
