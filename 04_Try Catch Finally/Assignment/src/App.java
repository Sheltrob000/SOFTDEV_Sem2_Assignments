import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("type first number");
        int number1 = scanner.nextInt();
        System.out.println("type the second number");
        int number2 = scanner.nextInt();
        
        try {
            int divided = number1 / number2;
            System.out.println(divided);
        }catch(ArithmeticException e) {
            System.out.println("you tried to divide by 0 you dummy");
        }
        scanner.close();


    }
}
