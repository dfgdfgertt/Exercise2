import java.util.Scanner;

public class Practice8 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int month = input.nextInt();
        System.out.print("Nhập năm của tháng đó: ");
        int year = input.nextInt();
        System.out.println("Tháng có: " + days(month,year) + " ngày");
    }

    public static int days(int month, int year){
        if (month > 12 || month < 1)
            return 0;
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (((year%4 == 0 && year%100 != 0) || (year%400 == 0))  && month == 2 )
            return 29;
        else
            return 28;
    }
}
