/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andika;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Andika {

    public static void main(String[] args) {
        
        // TODO code application logic here
        String name;
        int umur;
        Scanner sc = new Scanner(System.in);
        MANUSIA MANUSIA = new MANUSIA();
        System.out.print("Input your name: ");
        name = sc.nextLine();
        System.out.print("Input yeras old:");
        umur = sc.nextInt();
        System.out.print("Input weight in kilogram: ");
        MANUSIA.weight = sc.nextDouble ();
        System.out.print("Input height in meter: ");
        MANUSIA.height = sc.nextDouble ();
        MANUSIA.calculateBMI();
        System.out.println("umurku "+ umur);
        System.out.println("namaku "+ name);
        
    }
    
}