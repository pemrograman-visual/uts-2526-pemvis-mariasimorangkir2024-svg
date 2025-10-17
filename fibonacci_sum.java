import java.util.*;
import java.lang.Math;

public class fibonacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, a, b, jumlah, berikut;

        n = Integer.parseInt(input.nextLine());
        a = 0;
        b = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + b;
            berikut = a + b;
            a = b;
            b = berikut;
        }
        System.out.println(jumlah);
    }
}
