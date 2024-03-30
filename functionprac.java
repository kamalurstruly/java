public class functionprac {
    public static void main(String[] args){
        printPatterns();
    }
    public static void printPatterns() {
        int rows = 5;
        while(rows > 0){
            System.out.print("*");
            int i = 0;
            while(i > rows){
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows--;
        }

    }

}
