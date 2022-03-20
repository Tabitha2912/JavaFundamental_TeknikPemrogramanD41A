/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assosiation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sasa
 */
public class MainAssosiation {
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNamaMahasiswa("Salma");
        
        MataKuliah matkul = new MataKuliah();
        matkul.setNamaMataKuliah("Pendidikan Agama Islam");
        MataKuliah matkul2 = new MataKuliah();
        matkul2.setNamaMataKuliah("Matematika Terapan");
        
        List<MataKuliah> empList = new ArrayList<MataKuliah>();
        empList.add(matkul);
        empList.add(matkul2);
        
        mahasiswa1.setMatakuliah(empList);
        
        System.out.println(mahasiswa1.getMatakuliah()+" adalah mata kuliah yang diambil oleh "+
                mahasiswa1.getNamaMahasiswa());
    }
}
