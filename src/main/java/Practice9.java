import java.util.Scanner;

public class Practice9 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 3 cạnh của tam giác:");
        System.out.print("Cạnh a: ");
        float a = input.nextFloat();
        System.out.print("Cạnh b: ");
        float b = input.nextFloat();
        System.out.print("Cạnh c: ");
        float c = input.nextFloat();
        triangleCheck(a,b,c);
    }

    public static void triangleCheck(float a, float b, float c){
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.print("Đây là tam giác");
           if ((a == b) && (b == c) && (c == a)) {
                System.out.println(" và là tam giác đều!");
           } else if ((a == b) || (b == c) || (c == a)) {
               System.out.println(" và là tam giác cân!");
           } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println(" và là tam giác vuông!");
            }else
                System.out.println(" thường!");
        }
        else {
            System.out.println("Đây không phải tam giác.");
        }
    }


}
