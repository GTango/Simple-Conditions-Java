import java.util.Scanner;

public class Number0_100_to_Text {
    public static final String[] units = { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    public static final String[] tens = {
            "", 		// 0
            "",		// 1
            "Twenty", 	// 2
            "Thirty", 	// 3
            "Forty", 	// 4
            "Fifty", 	// 5
            "Sixty", 	// 6
            "Seventy",	// 7
            "Eighty", 	// 8
            "Ninety" 	// 9
    };

    public static String convert(final int n) {

        if (n < 0) {
            return "invalid number";
        }
        if (n == 0){

            return "zero";
        }
        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n == 100){
            return "one hundred";
        }

        return "invalid number";
    }

    public static void main(final String[] args) {

        int n;
        Scanner s=new Scanner(System.in);

        n =s.nextInt();
        System.out.println(convert(n));

    }

}
