import java.util.Scanner;

public class Practice4 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.println("Phương trình có dạng ax2 + bx + c = 0");
        System.out.print("Nhập số a: ");
        float a = input.nextFloat();
        System.out.print("Nhập số b: ");
        float b = input.nextFloat();
        System.out.print("Nhập số c: ");
        float c = input.nextFloat();
        giaiPTBac2(a,b,c);

    }

    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
