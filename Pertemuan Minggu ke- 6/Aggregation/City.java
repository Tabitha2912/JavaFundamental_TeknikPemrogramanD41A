/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

/**
 *
 * @author Sasa
 */
public class City {
    private String name;
    private int tahunBerdiri ;
    private String provinsi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    City(String name, int tahunBerdiri, String provinsi)
    {
        this.name = name;
        this.tahunBerdiri = tahunBerdiri;
        this.provinsi = provinsi;
    }
    
    public void tampil(){
        System.out.println(getName()+" berdiri pada tahun "+getTahunBerdiri()+" terletak di provinsi "+getProvinsi());        
    }
}
