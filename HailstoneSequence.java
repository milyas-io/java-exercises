import java.util.Scanner;

public class HailstoneSequence{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        
        int n;
        do {
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Please enter a valid number");
        } while (n <= 0);

        System.out.println("The Sequence Produced:");
        
        while (n != 1) {
            System.out.print(n + ",");
            
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;  // FIXED
            }
        }

        System.out.print(n);
    }
}
