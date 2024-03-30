import java.util.Scanner;
public class positiveneg {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = Sc.nextInt();
        if (a > 0) {
            System.out.println(a+ " is Positive");
        } else if (a == 0) {
            System.out.println(a+ " is Zero");
        } else {
            System.out.println(a+ " is Negative");
        }
    }
}
