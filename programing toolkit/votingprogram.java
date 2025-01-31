import java.util.Scanner;

public class votingprogram{ 
  public int best(int age, int choice){
    return 0;
  };
  public int worst(int age,int choice){
    return 0;
  };
  public int average(int age,int choice){
    return 0;
  };
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter you age");
    int age = scan.nextInt();
    scan.nextLine();

    System.out.println("Enter one value out of these three \n 1.Best case scenario. \n 2.Worst Case scenario. \n 3. Average Case scenario.");
    int choice = scan.nextInt();
    scan.nextLine();

    scan.close();
  }
}
