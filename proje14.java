package Giris;
import java.util.Scanner;
public class proje14 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner det = new Scanner(System.in);

        System.out.print("1. sayıyı girin : ");
        a = det.nextInt();

        System.out.print("2. sayıyı girin : ");
        b = det.nextInt();

        System.out.print("3. sayıyı girin : ");
        c = det.nextInt();


        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println(a + " < " + b + " < " + c);
            }else {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c){
                System.out.println(b + " < " + a + " < " + c);
            }else {
                System.out.println(b + " < " + c + " < " + a);
            }
        }else {
            if (b < a){
                System.out.println(c + " < " + b + " < " + a);
            }else {
                System.out.println(c + " < " + a + " < " + b);
            }
        }
    }
}
