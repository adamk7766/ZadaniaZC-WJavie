package pl.gaamit.zad3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Wprowadź rok");
        Scanner scanner = new Scanner(System.in);
        int rok =  scanner.nextInt();
        if (rok % 4 == 0)
            System.out.println("Jest to rok przestępny");
        else
            System.out.println("Nie jest to rok przestępny");
    }
}
