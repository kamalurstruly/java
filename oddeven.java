import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        if (n%2 == 0){
            System.out.println(n+" is Even number");
        }else {
            System.out.println(n+" is odd number");
        }
    }
}
