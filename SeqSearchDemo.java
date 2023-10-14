import java.util.Scanner;

public class SeqSearchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int accNumber;

        System.out.println("Please enter an account number:");
        accNumber = scanner.nextInt();

        Validate checker = new Validate(); 
        if (checker.validate(accNumber)) {
            System.out.println("Account number is valid!");
        }
        else {
            System.out.println("Invalid account number.");
        }
        scanner.close();
    }
}
