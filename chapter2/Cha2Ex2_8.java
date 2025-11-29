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

public class Cha2Ex2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length, width, and height in meters: ");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        double volume = length * width * height;
        double weight = volume * 1000;

        System.out.println("The weight of the water is " + weight + " kilograms");
    }

}
