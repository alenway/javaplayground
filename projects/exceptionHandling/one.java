import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two values with space number: ");
            int value1 = scan.nextInt();
            int value2 = scan.nextInt();

            try {
                int result = value1 / value2;
                System.out.println(result);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("can not devide by zero");
            }
            System.out.println("program continues");
            scan.nextLine();
        }
    }
}
