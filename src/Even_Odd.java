import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {

        Scanner scen = new Scanner(System.in);

        int number = Integer.parseInt(scen.nextLine());

        if ( number % 2 == 0){

            System.out.println("even");
        }

        else{
            System.out.println("odd");
        }
    }
}
