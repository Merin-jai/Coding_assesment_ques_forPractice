import java.util.Scanner;
public class solutions {
    // Function to find the minimum number of operations to make a, b, c equal
    // by performing the operation of adding 1 to any two of them.


    static int minOperations(int a, int b, int c) {
        int sum = a + b + c;
        if (sum % 3 != 0) return -1;
        int target = sum / 3;
        return Math.max(0, (target - a) + (target - b) + (target - c)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            System.out.println(minOperations(a, b, c));
        }
        scanner.close();
    }
}