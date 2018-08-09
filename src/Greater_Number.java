import java.util.Scanner;

public class Greater_Number {
    public static void main(String[] args) {

        Scanner scen = new Scanner(System.in);


        int n1 =  Integer.parseInt(scen.nextLine());

        int n2 = Integer.parseInt(scen.nextLine());

        if(n1 > n2){
            System.out.println(n1);

        }
        else{
            System.out.println(n2);
        }


    }
}
