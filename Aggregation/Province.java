/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

import java.util.List;

/**
 *
 * @author Sasa
 */
public class Province {
    String name;
    private List<City> city;
    Province(String name, List<City> city)
    {
        this.name = name;
        this.city = city;
    }
    public List<City> getCity() {
        return city;
    }
}
