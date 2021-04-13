package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Animal Name: ");
        String animal = input.nextLine();
        int i=0;
        String response="Pick another animal";
        while (i < 3) {

            switch (animal) {
            case "cow":
                System.out.println("moo");
                System.out.println(response);
                animal = input.nextLine();
                break;

            case "cat":
                System.out.println("meow");
                System.out.println(response);
                animal = input.nextLine();
                break;
            case "dog":
                System.out.println("woof");
                System.out.println(response);
                animal = input.nextLine();
                break;
            case "bird":
                System.out.println("tweet-tweet");
                System.out.println(response);
                animal = input.nextLine();
                break;
            case "T-rex":
                System.out.println("Rawr");
                System.out.println(response);
                animal = input.nextLine();
                break;
            default:
                System.out.println("Animal not in a list!");
                break;
            }
            i++;
        }

    }
}
