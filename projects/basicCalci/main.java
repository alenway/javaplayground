import java.util.Scanner;

class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Choose Task to Perform ***");
            System.out.println("0.To Exit");
            System.out.println("1.To Add numbers");
            System.out.println("2.To subtract numbers");
            System.out.println("3.To divide numbers");
            System.out.println("4.To multiply numbers");
            System.out.print("---->   ");

            if (scan.hasNextInt()) {
                int choice = scan.nextInt();
                if (choice < 0) {
                    System.out.println("Enter a whole number.");
                } else {
                    if (choice == 0) {
                        System.out.println("The system has stopped.");
                        break;
                    } else {
                        if (choice > 4) {
                            System.out.println("Choose a number between 1-4 idiot");
                        } else {
                            System.out.println("Enter two value with a space: ");
                            int value1, value2;
                            value1 = scan.nextInt();
                            value2 = scan.nextInt();
                            scan.nextLine();

                            if (choice == 1) {
                                int result = add(value1, value2);
                                System.out.println("the result is : " + result);
                            } else if (choice == 2) {
                                int result = subtract(value1, value2);
                                System.out.println("the result is : " + result);
                            } else if (choice == 3) {
                                int result = divide(value1, value2);
                                System.out.println("the result is : " + result);
                            } else {
                                int result = multiply(value1, value2);
                                System.out.println("the result is : " + result);
                            }
                        }
                    }
                }
            } else {
                System.out.println("not a integer value");
                scan.nextLine();
            }
        }
    }
    // scan.close();
}
