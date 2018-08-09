import java.util.Scanner;

public class Choreography {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numbersteps = Integer.parseInt(scan.nextLine());
        double number_of_players = Integer.parseInt(scan.nextLine());
        double number_of_days = Integer.parseInt(scan.nextLine());

        double stes_per_day = (numbersteps / number_of_days) / numbersteps *100;
        double ceil = Math.ceil(stes_per_day);
        double percentage_player = ceil / number_of_players;


        if (stes_per_day <= 13){

            System.out.printf("Yes, they will succeed in that goal! %.2f%%." , percentage_player);
        }
        else
        {

            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentage_player);
        }
    }
}
