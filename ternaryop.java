import java.util.Scanner;

public class ternaryop {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int i = Sc.nextInt();
        System.out.println("Enter the second number");
        int j = Sc.nextInt();
        int greatNumber = i > j ? i : j;
        System.out.println(greatNumber+ " is great number");
    }
}
