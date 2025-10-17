//12s25019 Gebriel Glen Marcel Pakpahan//
//12s25033 Maria Octavia Simorangkir//


import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, var_return, i;

        n = Integer.parseInt(input.nextLine());
        x = 2;
        for (i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrima(int n) {
        boolean var_return;
        int j;

        if (n <= 1) {
            var_return = false;
        } else {
            j = 2;
            // for (Name = Start; Name <= End; Name++) {
            // }
        }
        
        return var_return;
    }
}
