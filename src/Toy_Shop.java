import java.util.Scanner;

public class Toy_Shop {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            double puzzle = 2.60;
            double doll = 3;
            double bear = 4.10;
            double mignon = 8.20;
            double truck = 2;
            double discount = 0;
            double final_price;

            double rent;

            double profit ;

            double remain;
            double missing ;




            double outings_price = Double.parseDouble(scan.nextLine());
            int numpuzzle = Integer.parseInt(scan.nextLine());
            int numdoll = Integer.parseInt(scan.nextLine());
            int numbear = Integer.parseInt(scan.nextLine());
            int nummignon = Integer.parseInt(scan.nextLine());
            int numtruck = Integer.parseInt(scan.nextLine());

            double sum = numpuzzle * puzzle + numdoll * doll + numbear * bear + nummignon * mignon + numtruck * truck;

            int nymtoys = numtruck+ nummignon + numbear + numdoll +numpuzzle;

            if (nymtoys >= 50){

                discount = 0.25 * sum;

                final_price = sum - discount;

                rent = final_price * (1 + 0.1)- final_price;

                profit = final_price - rent;
                remain = profit - outings_price;
                missing = outings_price - profit ;
            }
            else {
                final_price = sum - discount;
                rent = (sum * (1 + 0.1) - sum);
                profit = final_price - rent;
                remain = profit - outings_price;
                missing = outings_price - profit;
            }

            if (profit > outings_price ){

                System.out.printf("Yes! %.2f lv left.",remain);
            }
            else
            {
                System.out.printf("Not enough money! %.2f lv needed.",missing );
            }
        }
    }




