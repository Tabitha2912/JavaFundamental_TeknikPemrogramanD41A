/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus2;

/**
 *
 * @author Sasa
 */
public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;

 
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    void printDojutsu() {
         System.out.println(this.Dojutsu);
         this.setDojutsu();
         System.out.println(this.Dojutsu);
    }
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    
}
