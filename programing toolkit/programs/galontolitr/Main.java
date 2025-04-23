import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double gallons, liters;

        try{
            System.out.println("Enter 1 to convert into gallons and 2 for liters.");
            int choise = read.read();

            System.out.print("Enter value to change:");
            if (choise == 1) {
                liters = read.read();
                gallons = liters / 3.7854;
                System.out.println(liters + " liters into gallons is : " + gallons);
            } else {
                gallons = read.read();
                liters = gallons * 3.7854;
                System.out.println(gallons + " gallons into liters is : " + liters);
            }
        } catch(IOException){
System.out.println("error: ");
        }


    }
}
