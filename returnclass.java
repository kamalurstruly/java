import java.util.Scanner;

public class returnclass {
    public static void main(String[] args){
        int i = calNumber();
        int j = calNumber();
        System.out.println("multiple of the numbers "+(i*j));

    }
    public static int calNumber(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = Sc.nextInt();
        return number;

    }
}
