import java.util.Scanner;

public class recursive {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Sc.nextInt();
        long fact = iterativefact(num);
        long facts = factorial(num);
        System.out.println("Factorial of the number is "+fact);
    }
    public static long factorial(int num){
        System.out.println("Function Called for "+num);
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);

    }
    public static long iterativefact(int num){
        long result = 1;
        for(int i=1; i<=num; i++){
            result *= i;
        }
        return result;

    }
}
