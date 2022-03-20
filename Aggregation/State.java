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
class State {
    String stateName;
    private List<Province> province;
    State(String stateName,
    List<Province> province)
    {
        this.stateName = stateName;
        this.province = province;
    }
    // count total students of all departments
    // in a given institute
    public int getTotalCityInState()
    {
        int noOfCity = 0;
        List<City> city;
        for(Province prov : province)
        {
            city = prov.getCity();
            for(City s : city)
            {
                noOfCity++;
            }
        }
        return noOfCity;
    }
}
