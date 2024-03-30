import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Sc.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num){
        int i = 1;
        while(i<=10){
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }

    }
}
