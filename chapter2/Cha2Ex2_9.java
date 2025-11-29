/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author samir
 */

 import java.util.Scanner;

public class Cha2Ex2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial velocity (u), final velocity (v), and time (t): ");
        double u = input.nextDouble();
        double v = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v - u) / t;

        System.out.println("The acceleration is " + acceleration + " m/s²");
    }
   
}
