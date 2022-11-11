/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andika;

/**
 *
 * @author USER
 */
public class MANUSIA {
   double height, weight,hasil;
   
   void calculateBMI(){
       hasil = weight / (height * height);
       System.out.println("Your Body Mass Index (BMI) is : " + hasil);
       //Check kamu termasuk masuk pada
    }   
}
