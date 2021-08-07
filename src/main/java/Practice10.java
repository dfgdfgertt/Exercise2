import java.util.Scanner;

public class Practice10 {

    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = input.nextInt();
        System.out.println("Năm này là năm nhuận: " + yearCheck(year));
    }

    public static boolean yearCheck(int year){
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
