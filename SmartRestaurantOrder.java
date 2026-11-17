/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartrestaurantorder;
import java.util.Scanner;

/**
 *
 * @author Bahi
 */
public class SmartRestaurantOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

final double DRINK_PRICE = 15.50;

String name;
int age;
double mealPrice;
int drinks;
boolean isStudent;
int rating;

System.out.print("Enter customer name: ");
name = input.nextLine();

System.out.print("Enter age: ");
age = input.nextInt();

System.out.print("Enter meal price: ");
mealPrice = input.nextDouble();

System.out.print("Enter number of drinks: ");
drinks = input.nextInt();

System.out.print("Are you a student? true/false: ");
isStudent = input.nextBoolean();

System.out.print("Enter service rating (1-5): ");
rating = input.nextInt();

double drinksCost = drinks * DRINK_PRICE;
double subtotal = mealPrice + drinksCost;
double discountRate = 0;

if (isStudent) {
    discountRate = 0.10;
} else if (age >= 60) {
    discountRate = 0.05;
} else {
    discountRate = 0;
}

double discountAmount = subtotal * discountRate;
double tipAmount = 0;

if (rating < 1 || rating > 5) {
    System.out.println("Error: Invalid rating!");
} else {
    double afterDiscount = subtotal - discountAmount;

    if (rating == 4 || rating == 5) {
        tipAmount = afterDiscount * 0.10;
    } else {
        tipAmount = 0;
    }

    double finalBill = afterDiscount + tipAmount;
    int wholeBill = (int) finalBill;

    System.out.println("\n===== SMART RESTAURANT =====");
    System.out.println("Customer: " + name);
    System.out.printf("Meal: $%.2f%n", mealPrice);
    System.out.printf("Drinks: $%.2f%n", drinksCost);
    System.out.printf("Discount: $%.2f%n", discountAmount);
    System.out.printf("Tip: $%.2f%n", tipAmount);
    System.out.printf("Final bill: $%.2f%n", finalBill);
    System.out.println("Whole amount: $" + wholeBill);
}

input.close();
        
    }
    
}
