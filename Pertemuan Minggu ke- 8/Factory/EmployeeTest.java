/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author Sasa
 */
public class EmployeeTest {
    public static void main (String[] args){
       Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        System.out.println("\n");
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();

        Manager[] a = new Manager[5];
        a[1]=new Manager("Linda Bianchi", 2500000, 1, 12, 1991);
        a[0]=new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        a[2]=new Manager("Giulio Rossi", 3500000, 1, 10, 1994);
        a[3]=new Manager("Carla Berni", 2800000, 1, 11, 1995);
        a[4]=new Manager("Emma Verdi", 3100000, 1, 11, 1992);
        System.out.println("\n");
        System.out.println("= Sebelum dilakukan sorting =");
        for (i = 0; i < a.length; i++) a[i].print();
        System.out.println("\n");
        System.out.println("= Setelah dilakukan sorting =");
        Sort.shell_sort(a);
        for (i = 0; i < a.length; i++) a[i].print();

    }
}
