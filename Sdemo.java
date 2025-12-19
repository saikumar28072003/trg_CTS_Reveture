import java.util.Scanner;

class Sdemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size for the 'S' pattern:");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    System.out.print("*");
                }
                else if (i == n / 2 + 1) {
                    System.out.print("*");
                }
                else if (i == n) {
                    System.out.print("*");
                }
                else if (i < n / 2 + 1 && j == 1) {
                    System.out.print("*");
                }
                else if (i > n / 2 + 1 && j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
