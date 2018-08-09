import java.util.Scanner;

public class Bonus_Score {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        double bonusPoints = 0;

        if(number <= 100){

            bonusPoints = 5;
        }
        else if(number > 100 && number <= 1000){
            bonusPoints = 0.2 * number;

        }
        else if(number > 1000){
            bonusPoints = 0.1 * number;
        }

        if( number % 2 == 0){
            bonusPoints = bonusPoints + 1;
        }
        else if(number % 10 == 5){
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(number + bonusPoints);
    }
}
