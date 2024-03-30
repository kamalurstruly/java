import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter ur name: ");
        System.out.println("Also tell ur age");
        String name = Sc.nextLine();
        int i = Sc.nextInt();
        System.out.println("Welcome "+name);
        System.out.print("Age is "+i);

    }
}
