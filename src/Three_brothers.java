import java.util.Scanner;

public class Three_brothers {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        double brother1 = Double.parseDouble(scan.nextLine());
        double brother2 = Double.parseDouble(scan.nextLine());
        double brother3 = Double.parseDouble(scan.nextLine());
        double dad = Double.parseDouble(scan.nextLine());

        double opstoVreme = 1/(1/brother1+ 1/brother2+ 1/brother3);
        double pause =(0.15 * opstoVreme) + opstoVreme;
        double diff =  dad - pause;

        System.out.printf("Cleaning time: %.2f%n", pause);

        if(diff > 0){

            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", (Math.floor(diff)));
        }
        else {
            diff = Math.abs(diff);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours. ", (Math.ceil(diff)));
        }


    }
}
