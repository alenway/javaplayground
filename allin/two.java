public class two {
    public static void main(String[] args) {
        int n = 1;
        int[] arr = { 1, 2, 3, 4, 5 };
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loops
        while (n < 5) {
            System.out.println(n);
            n++;
        }

        // do while loops
        do {
            System.out.println(n);
            n++;
        } while (n < 5);

        // for each loop
        for (int num : arr) {
            System.out.println(num);
        }

        // === === === === === === === === === === === === === === === === === ===

        // if else and else if
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("first");
        } else if (a == b) {
            System.out.println("second");
        } else {
            System.out.println("three");
        }

        // switch
        switch (a) {
            case 1:
                System.out.println("case one");
                break;
            case 2:
                System.out.println("case two");
                break;
            default:
                System.out.println("default");
        }

        // new switch
        int day = 2;
        String sw = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "sunday";
        };

        // ternary
        String value = (a > b) ? "greater" : "less";

    }
}
