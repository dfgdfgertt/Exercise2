import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

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
        sort(a,b,c,d);
    }

    public static void sort(int a, int b, int c, int d){
//        int[] arr = {a,b,c,d};
//        Arrays.sort(arr);
//        System.out.print(Arrays.toString(arr));
        int num1,num2,num3,num4,temp;
        if (a>b){
            num1 = b;
            num2 = a;
        }else {
            num1 =a;
            num2 =b;
        }
        if (c>d){
            num3 = d;
            num4 = c;
        }else {
            num3 = c;
            num4 = d;
        }
        if (num1 > num3){
            temp = num1;
            num1 = num3;
            num3= temp;
        }
        if (num2 > num4){
            temp = num2;
            num2 = num4;
            num4= temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3= temp;
        }
        System.out.print(num1 + " " + num2 + " " + num3 + " " + num4);
    }


}
