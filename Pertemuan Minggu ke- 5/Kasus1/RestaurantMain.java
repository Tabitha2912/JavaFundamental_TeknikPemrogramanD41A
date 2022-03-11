/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus1;

import java.util.Scanner;

/**
 *
 * @author Sasa
 */
public class RestaurantMain {
    public static void main(String[] args) {
        
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 10);
        
        menu.penguranganStok(2, 3);
        menu.tampilMenuMakanan();
        
        menu.pesanMakanan();
        menu.tampilMenuMakanan();
        
        
    }
}

