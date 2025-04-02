import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            while (true) {
                System.out.print("Enter any day of the week: ");
                String str = read.readLine();
                String result = switch (str.toLowerCase()) {
                    case "sunday" -> "don't wake up.";
                    case "monday" -> "get up.";

                    default -> "Wake up to reality.";
                };
                System.out.println(result);
            }
        } catch(IOException){

        }

    }
}
