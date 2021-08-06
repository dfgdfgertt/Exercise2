import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Practice5 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 4 số nguyên:");
        System.out.print("Nhập số a: ");
        int a = input.nextInt();
        System.out.print("Nhập số b: ");
        int b = input.nextInt();
        System.out.print("Nhập số c: ");
        int c = input.nextInt();
        System.out.print("Nhập số d: ");
        int d = input.nextInt();
        System.out.print("Số nhỏ nhất là: " +  minSearch(a,b,c,d));
    }

    public static int minSearch(int a, int b, int c, int d){
        int min = 0;
        if (a < b && a < c && a < d){
            min = a;
        }else if(b < a && b < c && b < d){
            min = b;
        }
        else if(c < a && c < b && c < d){
            min = c;
        }
        else {
            min = d;
        }
        return min;

    }
}
