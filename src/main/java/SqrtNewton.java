import java.util.Scanner;

public class SqrtNewton {
        public static int mySqrt(int x) {
            if (x < 2) return x; // 0 -> 0, 1 -> 1

            long r = x; // start with r = x
            // iterate until r*r <= x
            while (r * r > x) {
                r = (r + x / r) / 2;
            }
            return (int) r;
        }

        public static void main(String[] args) {
            // Example test cases
            int[] tests = {0, 1, 2, 3, 4, 8, 9, 10, 15, 16, Integer.MAX_VALUE};

            System.out.println("Newton's method: compute floor(sqrt(x))\n");
            for (int t : tests) {
                System.out.printf("x = %d -> mySqrt(x) = %d%n", t, mySqrt(t));
            }

            // Interactive: let user input numbers
            Scanner sc = new Scanner(System.in);
            System.out.println("\nTry your own non-negative integers. Type a negative number to exit.");
            while (true) {
                System.out.print("Enter x: ");
                if (!sc.hasNextLong()) {
                    System.out.println("Please enter a valid integer.");
                    sc.next(); // discard bad token
                    continue;
                }
                long val = sc.nextLong();
                if (val < 0) {
                    System.out.println("Goodbye!");
                    break;
                }
                if (val > Integer.MAX_VALUE) {
                    System.out.println("Value too large for this demo (must be <= " + Integer.MAX_VALUE + ").");
                    continue;
                }
                int x = (int) val;
                System.out.printf("floor(sqrt(%d)) = %d%n", x, mySqrt(x));
            }
            sc.close();
        }
    }
