package pl.gaamit.zad2_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double masa, wzrost, bmi;
        System.out.println("Proszę podać wagę ciała w kilogramach");
        Scanner scanner = new Scanner(System.in);
        masa = scanner.nextDouble();
        System.out.println("Proszę podać wzrost w metrach");
        wzrost = scanner.nextDouble();
        bmi = (masa / (wzrost * wzrost));
        System.out.println("Wskaźnik BMI = " + bmi);
    }
}
