package pl.gaamit.zad3_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double wynik = 0;
        System.out.println("Wprowadź liczbę a");
        Scanner scanner = new Scanner(System.in);
        double a =  scanner.nextDouble();


        System.out.println("Wprowadź znak działania");
        String znak = scanner.next();
        System.out.println("Wprowadź liczbę b");
        double b =  scanner.nextDouble();
        {
            if (znak.equals("+"))
                wynik = a + b;
            else if (znak.equals("-"))
                wynik = a - b;
            else if (znak.equals("*"))
                wynik = a * b;
            else if (znak.equals("/"))
                wynik = a / b;
            else
                System.out.println("podano niewlaściwy znak działania");
        }
        System.out.println(wynik);
    }
}
