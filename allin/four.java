import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of layers: ");
        int n = scan.nextInt();
        scan.nextLine();
        // trangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // reverse
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // triangle numbers
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // frouds triangle
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);
        // num++;
        // }
        // System.out.println();
        // }

        // prymid
        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i - 1; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        scan.close();
    }
}
