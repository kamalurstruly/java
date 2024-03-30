import java.util.Scanner;
public class swapping {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number of A ");
        int a = Sc.nextInt();
        System.out.println("enter the number of B");
        int b = Sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping is done....");
        System.out.println("value of A "+a);
        System.out.println("value of B "+b);

    }
}
