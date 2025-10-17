//12s25019 Gebriel Glen Marcel Pakpahan//
//12s25033 Maria Octavia Simorangkir//


import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka1, angka2, jumlah, kali, bagi, kurang;
        String pilihan;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            angka1 = Integer.parseInt(input.nextLine());
            angka2 = Integer.parseInt(input.nextLine());
            jumlah = angka1 + angka2;
            System.out.println(jumlah);
        } else {
            if (pilihan.equals("2")) {
                angka1 = Integer.parseInt(input.nextLine());
                angka2 = Integer.parseInt(input.nextLine());
                kurang = angka1 - angka2;
                System.out.println(kurang);
            } else {
                if (pilihan.equals("3")) {
                    angka1 = Integer.parseInt(input.nextLine());
                    angka2 = Integer.parseInt(input.nextLine());
                    kali = angka1 * angka2;
                    System.out.println(kali);
                } else {
                    if (pilihan.equals("4")) {
                        angka1 = Integer.parseInt(input.nextLine());
                        angka2 = Integer.parseInt(input.nextLine());
                        bagi = (double) angka1 / angka2;
                        System.out.println(bagi);
                    }
                }
            }
        }
    }
    
    public static void yyaa() {
    }
}
