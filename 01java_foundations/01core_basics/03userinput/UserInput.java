import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter you height in meters: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

        scanner.close();
    }
}
