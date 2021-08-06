import java.util.Scanner;

public class Practice3 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Phương trình có dạng ax + b =0 ");
        System.out.print("Nhập số a: ");
        int a = input.nextInt();
        System.out.print("Nhập số b: ");
        int b = input.nextInt();
        System.out.println("x = " + ((-b)/(float)a) );

    }
}
