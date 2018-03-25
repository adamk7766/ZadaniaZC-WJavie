package pl.gaamit.zad3_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a, b, c, delta, x1, x2, x0;
        System.out.println("Proszę podać współczynnik a");
        Scanner scanner = new Scanner(System.in);
        a =  scanner.nextDouble();
        System.out.println("Proszę podać współczynnik b");
        b =  scanner.nextDouble();
        System.out.println("Proszę podać współczynnik c");
        c =  scanner.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta > 0) //jeśli delta jest większa od 0 to mamy dwa miejsca zerowe
        {
            x1 = (-b - Math.sqrt(delta)) / (2 * a); //wyznaczamy 1 miejsce zerowe
            x2 = (-b + Math.sqrt(delta)) / (2 * a); //wyznaczamy 2 miejsce zerowe
            System.out.println("Delta jest wiesza od zera dlatego funkcja ma dwa miejsca zerowe: x1 = " + x1 + " a x2 = " + x2);
        }
        else if (delta == 0)
        {
            x0 = -b / (2 * a); //wyznaczamy jedno miejsce zerowe
            System.out.println("Delta jest równa zero dlatego funkcja ma jedno miejsce zerowe: x0 = " + x0);
        }
        else
            System.out.println("Delta jest mniejsza od zera dlatego funkcja nie ma miejsc zerowych");
    }
}
