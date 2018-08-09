import java.util.Scanner;

public class Excellent_Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double result = Double.parseDouble(scan.nextLine());

        if (result >= 5.50){
            System.out.println("Excellent!");
        }
    }
}
