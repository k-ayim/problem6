import java.util.Scanner;

public class Problem6ExponentiationRecursive {
    
    /**
     * Calculates the exponentiation of a number using recursion.
     * 
     * @param base The base number
     * @param exponent The exponent
     * @return The result of base raised to the power of exponent
     */
    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        long result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
        
        scanner.close();
    }
}



