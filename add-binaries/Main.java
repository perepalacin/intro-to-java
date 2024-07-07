import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Two variables to hold the numbers to operate
        long b1, b2;
        int i = 0, carry = 0;

        //This array will hold the output
        int[] sum = new int[10];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first binary number: ");
        b1 = sc.nextLong();

        System.out.println("Enter the second binary number: ");
        b2 = sc.nextLong();

        sc.close();

        while (b1!= 0 || b2 != 0 ) {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry ) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry ) % 2);
            b1 = b1 /10;
            b2 = b2 / 10;
        }
        if (carry != 1) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }    
}
