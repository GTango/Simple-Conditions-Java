import java.util.Scanner;

public class Equal_Words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.equals(word2)){

            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
