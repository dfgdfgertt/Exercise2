import java.util.Scanner;

public class Practice11 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = input.nextInt();
        System.out.print("Nhập tháng: ");
        int month = input.nextInt();
        System.out.print("Nhập năm : ");
        int year = input.nextInt();
        dayCheck(day, month, year);
    }

    public static int days(int month, int year){
        if (month > 12 || month < 1)
            return 0;
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (year%4 == 0 && month == 2 && year%100 != 0)
            return 29;
        else
            return 28;
    }

    public static void dayCheck(int day, int month, int year){
        if (days(month,year) == 0 )
            System.out.println("Không hợp lệ.");
        else if (day > 0 && day <= days(month,year)){
            System.out.println("Hợp lệ.");
            dayBefore(day,month,year);
            dayAfter(day,month,year);
        }else
            System.out.println("Không hợp lệ.");
    }

    public static void dayBefore(int day, int month, int year){
        if (day == 1){
            if (month == 1){
                year-=1;
                month=12;
            }else {
                month-= 1;
            }
            day = days(month,year);
        }else {
            day-=1;
        }
        System.out.println("Ngày " + day + "/" + month + "/" + year);
    }
    public static void dayAfter(int day, int month, int year){
        if (day == days(month,year)){
            day = 1;
            if (month == 12){
                year+= 1;
                month=1;
            }else {
                month+=1;
            }
        }else
            day+=1;
        System.out.println("Ngày " + day + "/" + month + "/" + year);
    }


}
