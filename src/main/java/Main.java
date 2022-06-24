import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args ){
        String userName;

        System.out.print("What's your name? ");
        Scanner in = new Scanner(System.in);
        userName = in.nextLine();

        System.out.println("Hello " + userName);
    }
}
