import java.util.Scanner;

public class Area_of_Figures {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double area;
        String figure = scan.nextLine();

        if(figure.equals("square")){

            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
            System.out.println(area);
        }
        else if (figure.equals("rectangle")){

            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = sideA * sideB;
            System.out.println(Math.round(area));

        }

        else if (figure.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            area =  radius * radius * Math.PI;
            System.out.printf("%.3f " ,area);
        }

        else if (figure.equals("triangle")){

            double side =  Double.parseDouble(scan.nextLine());
            double height =  Double.parseDouble(scan.nextLine());
            area= 0.5 *(side * height);
            System.out.println(area);
        }

    }
}
