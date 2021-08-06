import java.util.Locale;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào 1 chữ cái: ");
        String character = input.nextLine();

        if (!character.equals(character.toLowerCase())){
            System.out.println(character.toLowerCase());
        }else {
            System.out.println(character.toUpperCase());
        }
    }
}
