import java.util.Scanner;

public class Practice1 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int num = input.nextInt();

        if (num >=1 && num <=9){
            System.out.println(num);
        }else {
            System.out.println("Không đọc được");
        }
    }
}
