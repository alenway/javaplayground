import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int loop = scan.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= loop; i++) {
            for (int j = i; j <= i; j++) {
                System.out.println(a);
                int next = a + b;
                a = b;
                b = next;
            }
            System.err.println();
        }
        scan.close();
    }
}
