/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assosiation;

import java.util.List;

/**
 *
 * @author Sasa
 */
public class Mahasiswa {
    private String namaMahasiswa;
    List<MataKuliah> matakuliah;

    public List<MataKuliah> getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(List<MataKuliah> matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    } 
}
