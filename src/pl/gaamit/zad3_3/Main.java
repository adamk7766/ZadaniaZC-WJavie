package pl.gaamit.zad3_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Wprowadź liczbę a");
        Scanner scanner = new Scanner(System.in);
        int a =  scanner.nextInt();
        System.out.println("Wprowadź liczbę b");
        int b =  scanner.nextInt();
        System.out.println("Wprowadź liczbę c");
        int c =  scanner.nextInt();
        if (a > b && a > c)
            System.out.println("Liczba a najwieksza");
        else if (b > a && b > c)
            System.out.println("Liczba b najwieksza");
        else if (c > a && c > b)
            System.out.println("Liczba c najwieksza");
    }
}
