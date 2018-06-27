import java.util.Scanner;

public class FinalWork {
    public static void main(String[] args) {
        // declare & initialize scanner and age vars
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age;
        age = scanner.nextInt();

        // if/else statement that determines if user is a teenager
        if (age < 13 || age > 19) {
            System.out.println("You are not a teenager.");
        } else {
            System.out.println("You are a teenager.");
        }
    }
}
