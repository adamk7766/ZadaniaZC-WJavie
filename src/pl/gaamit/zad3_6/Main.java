package pl.gaamit.zad3_6;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double bmi;
        System.out.println("Proszę podać wagę ciała w kilogramach");
        Scanner scanner = new Scanner(System.in);
        double masa = scanner.nextDouble();
        System.out.println("Proszę podać wzrost w metrach");
        double wzrost = scanner.nextDouble();
        bmi = (int) masa / (wzrost * wzrost);
        if (bmi < 16)
            System.out.println("Wskaźnik BMI = " + bmi + " Wygłodzenie");
        else if (bmi >= 16 && bmi < 17)
            System.out.println("Wskaźnik BMI = " + bmi + " Wychudzenie");
        else if (bmi >= 17 && bmi < 19)
            System.out.println("Wskaźnik BMI = " + bmi + " Niedowaga");
        else if (bmi >= 19 && bmi < 25)
            System.out.println("Wskaźnik BMI = " + bmi + " Prawidłowa waga");
        else if (bmi >= 25 && bmi < 30)
            System.out.println("Wskaźnik BMI = " + bmi + " Nadwaga");
        else if (bmi >= 30 && bmi < 35)
            System.out.println("Wskaźnik BMI = " + bmi + " I stopień otyłości");
        else if (bmi >= 35 && bmi < 40)
            System.out.println("Wskaźnik BMI = " + bmi + " II stopień otyłości");
        else if (bmi >= 40)
            System.out.println("Wskaźnik BMI = " + bmi + " III stopień otyłości");

    }
}
