import java.util.Scanner;

public class World_swimming_record {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record_in_seconds = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time_in_seconds = Double.parseDouble(scan.nextLine());

        double swim = distance * time_in_seconds;
        double addtime = Math.floor(distance / 15) * 12.5;
        double general_time = swim + addtime;

        double vremekoenedostasuva = general_time - record_in_seconds;

        if (record_in_seconds <= general_time){

            System.out.printf("No, he failed! He was %.2f seconds slower.",vremekoenedostasuva );
        }
        else {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", general_time );
        }
    }
}
