import java.util.Scanner;

public class calternary {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = Sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = Sc.nextInt();
        System.out.println("Select the operator");
        String operator = Sc.next();

        int result = switch(operator){
            case "+" -> num1 + num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "-" -> num1 - num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.println("Your result is "+result);

    }
}
