/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
import java.lang.Math;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int height = myApp.readH();
        int weight = myApp.readW();
        double bmi = myApp.calcBMI(height, weight);
        if(bmi < 18.5)
            System.out.println("Your BMI is " + bmi + ".\nYou are underweight. You should see your doctor.");
        else if(bmi > 25)
            System.out.println("Your BMI is " + bmi + ".\nYou are overweight. You should see your doctor.");
        else
            System.out.println("Your BMI is " + bmi + "." + "\nYou are within the ideal weight range.");
    }
    private double calcBMI(int h, int w){
        return (w / (Math.pow(h, 2))) * 703;
    }
    private int readH(){
        System.out.print("Please enter your height in inches. ");
        while(!inp.hasNextInt()) {
            System.out.print("Please enter a numerical height in inches. ");
            inp.nextLine();
        }
        return Integer.parseInt(inp.nextLine());
    }
    private int readW(){
        System.out.print("Please enter your weight in pounds. ");
        while(!inp.hasNextInt())
            System.out.print("Please enter a numerical weight in pounds. ");
        return Integer.parseInt(inp.nextLine());
    }
}
