import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int plus15 =  15;

        int time = hour * 60 + minutes + plus15;

        hour = time / 60;
        minutes = time % 60;

        if (hour == 24){
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minutes);
    }
}
