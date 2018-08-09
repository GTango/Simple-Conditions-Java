import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double dohod = Double.parseDouble(scan.nextLine());
        double sredenUspeh = Double.parseDouble(scan.nextLine());
        double minimalnaplata = Double.parseDouble(scan.nextLine());
        double presmetka = 0;
        double presmetka2 = 0;

        if (dohod > minimalnaplata && sredenUspeh > 4.5) {

            System.out.println("You cannot get a scholarship!");
        }
        else if (sredenUspeh < 5.50) {
            System.out.println("You cannot get a scholarship!");
        }

        if (dohod < minimalnaplata && sredenUspeh > 4.50) {

            presmetka = 0.35 * minimalnaplata;

            if (sredenUspeh > 5.50) {

                presmetka2 = sredenUspeh * 25;

                if (presmetka > presmetka2) {

                    System.out.printf("You get a Social scholarship %.0f BGN", presmetka);

                }



                else {


                    System.out.printf("You get a scholarship for excellent results %.0f BGN", presmetka2);
                }
            }
        }
    }

}
