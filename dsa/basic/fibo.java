import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter number: ");
            try {
                String input = br.readLine();
                int number = Integer.parseInt(input);
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    System.out.println(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
