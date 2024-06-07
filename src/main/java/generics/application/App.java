package generics.application;

import generics.services.PrintService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int values = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the values: ");
        for (int i = 0; i < values; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());
    }
}
