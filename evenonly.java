import java.util.Scanner;

public class evenonly {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }

    }


}
