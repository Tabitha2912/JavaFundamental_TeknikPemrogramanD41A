/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependence;

import java.io.Console;

/**
 *
 * @author Sasa
 */
class Lampu {
    public int status;
    public void Start(Listrik L)
    { 
        L.Nyala();
    }
    public void Run(Listrik L)
    { 
        System.out.println("Lampu menyala");
    }
    public void End(Listrik L)
    { 
        L.Mati();
    }
    
}
