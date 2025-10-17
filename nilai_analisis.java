//12s25019 Gebriel Glen Marcel Pakpahan//
//12s25033 Maria Octavia Simorangkir//

import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, besar, rendah, n, total;

        n = Integer.parseInt(input.nextLine());
        int[] nilai = new int[n];

        total = 0;
        for (i = 0; i <= n - 1; i++) {
            nilai[i] = Integer.parseInt(input.nextLine());
            total = nilai[i] + total;
        }
        besar = nilai[0];
        rendah = nilai[0];
        for (i = 1; i <= n - 1; i++) {
            if (nilai[i] > besar) {
                besar = nilai[i];
            }
            if (nilai[i] < rendah) {
                rendah = nilai[i];
            }
        }
        total = (double) total / n;
        System.out.println("Rata-rata= " + total);
        System.out.println("Tertinggi = " + besar);
        System.out.println("Terendah= " + rendah);
    }
}
