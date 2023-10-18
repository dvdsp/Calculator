/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validate {
   
    public static double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.print("Invalid value. Let's enter again:       ");
            }
        }
    }  
}
