package pl.gaamit.zad2_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a, b, c, delta;
        System.out.println("Proszę podać współczynnik a");
        Scanner scanner = new Scanner(System.in);
        a =  scanner.nextDouble();
        System.out.println("Proszę podać współczynnik b");
        b =  scanner.nextDouble();
        System.out.println("Proszę podać współczynnik c");
        c =  scanner.nextDouble();
        delta = b*b-4*a*c;
        System.out.println("delta = " + delta);

    }
}
