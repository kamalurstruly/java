import java.util.Scanner;

public class oddeventernary {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Sc.nextInt();
        String result = num%2 == 0 ? "even" : "odd";
        System.out.println("Your number is "+result);
    }
}
