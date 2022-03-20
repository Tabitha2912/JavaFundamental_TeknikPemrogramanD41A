/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

import java.util.List;

/**
 *
 * @author Sasa
 */
public class Komplek {
    // reference to refer to list of books.
    private final List<Rumah> rumah;
    Komplek (List<Rumah> rumah)
    {
        this.rumah = rumah;
    }
    public List<Rumah> getTotalRumahDiKomlek(){
        return rumah;
    }
}
