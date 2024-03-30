public class breakcontinue {
    public static void main(String[] args){
        for (int i=1; i<=1000; i++){
            if(i==109){
                break;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i=1; i<=50; i++){
            if(i==35){
                continue;
            }
            System.out.print(i+ " ");
        }
    }
}
