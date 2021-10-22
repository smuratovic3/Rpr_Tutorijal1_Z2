package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    static int SumaCifara(int n) {
        int suma = 0, m;
        while (n > 0) {
            m = n % 10;
            suma += m;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi broj n: ");
        int n = ulaz.nextInt();
        System.out.println("Brojevi između 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i % SumaCifara(n) == 0) {
                System.out.println(i);
            }

        }
    }
}
