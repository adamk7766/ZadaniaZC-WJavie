package pl.gaamit.zad3_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Wprowadź liczbę 1");
        Scanner scanner = new Scanner(System.in);
        int liczba1 =  scanner.nextInt();
        System.out.println("Wprowadź liczbę 2");
        int liczba2 =  scanner.nextInt();
        if (liczba1 % liczba2 == 0)
            System.out.println("Liczba2 jest dzielnikiem Liczby1");
        else
            System.out.println("Liczba2 nie jest dzielnikiem Liczby1");

    }
}
