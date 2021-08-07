import java.util.Scanner;

public class Practice7 {
    public static void main(String[] ag){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số Km:");
        float km = input.nextFloat();
        System.out.println("Số tiền là: " + total(km) );
    }

    public static float total(float km){
        float total=0;
        if(km < 2){
            total = km*15000;
        }else if (km >= 2 && km < 6){
            total = 2*15000 + (km-2)*13500;
        }else  if (km >= 6 && km < 120 ){
            total = 2*15000 + 4*13500 + (km-6)*11000;
        }else {
            total = (float) ((2*15000 + 4*13500 + (km-6)*11000)* 0.9);
        }
        return total;
    }
}
