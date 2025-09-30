import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you name: ");
        try {
            String name = scan.readLine();
            System.out.println("your name " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
