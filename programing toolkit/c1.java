import java.util.Scanner;

public class c1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter you age: ");
    int age = scan.nextInt();
    scan.nextLine();

    if(age >= 18 ){
      System.out.println("The person is elegable for voting.");
    } else {
      System.out.println("The person is not elegable for voting.");
    }
  }
}
