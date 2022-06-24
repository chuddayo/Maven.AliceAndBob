import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args ){
        String userName;

        System.out.print("What's your first name? ");
        Scanner in = new Scanner(System.in);
        userName = in.next(); // only gets first word

        // This line sets their first initial to capital and the rest lowercase
        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase();
        if (userName.toLowerCase().equals("alice") || userName.toLowerCase().equals("bob")) {
            System.out.println("Howdy " + userName + ". Good to see you again.");
        }
        else {
            System.out.println("Pleased to meet you, " + userName + ".");
        }
    }
}
