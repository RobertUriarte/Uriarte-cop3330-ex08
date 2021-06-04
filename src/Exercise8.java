/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) { //Program to determine number of pizzas per person at pizza party
        Scanner scan = new Scanner(System.in);
        System.out.printf("How many people do you have? ");
        int people = scan.nextInt();
        System.out.printf("How many pizzas do you have? ");
        int pizza = scan.nextInt();
        System.out.printf("How many slices per pizza? ");
        int slices = scan.nextInt();

        int total_pizza = slices * pizza;

        System.out.printf("Each person gets %d pieces of pizza\n", people/total_pizza);
        System.out.printf("There are %d leftover pieces of pizza", people % total_pizza);
    }
}