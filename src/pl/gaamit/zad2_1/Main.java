package pl.gaamit.zad2_1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double C, F;
        System.out.println("Proszę podać ilość stopni Celsjusza");
        Scanner scanner = new Scanner(System.in);
        C =  scanner.nextDouble();
        F = 32 + 9 * C / 5;
        System.out.println(C + " stopni C. to " + F + " stopni/e F");
    }
}
