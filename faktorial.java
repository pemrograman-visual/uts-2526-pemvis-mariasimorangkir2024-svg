//12s25019 Gebriel Glen Marcel Pakpahan//
//12s25033 Maria Octavia Simorangkir//


import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, result;

        n = Integer.parseInt(input.nextLine());
        result = factorial(n);
        System.out.println(result);
    }
    
    public static int factorial(int inX) {
        int result;

        if (inX == 0) {
            result = 1;
        } else {
            result = inX * factorial(inX - 1);
        }
        
        return result;
    }
}
