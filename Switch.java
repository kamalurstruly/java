import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the day number");
        int day = Sc.nextInt();
        Switch S1 = new Switch();
        S1.oldSwitch(day);
        S1.newSwitch(day);

    }
    public void oldSwitch(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Days");

        }
    }
    public void newSwitch(int day){
        String dayStr = switch (day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid";
        };
        System.out.println(dayStr);

    }
}
