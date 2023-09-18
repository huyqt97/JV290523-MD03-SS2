import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhận chiều rộng hình : ");
        int w = sc.nextInt();
        System.out.println("Nhập chiều cao : ");
        int h = sc.nextInt();
        System.out.println("Nhập hình muốn xem : ");
        System.out.println("1. hình vuông");
        System.out.println("2. tam giác");
        System.out.println("3. tam giác ngược");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                vuong(w,h);
                break;
            case 2:
                tg(w,h);
                break;
            case 3:
                tgn(w,h);
                break;
            default:
                System.out.println("nhập không hợp lệ!");
                break;
        }
    }
    public static void vuong(int w,int h){
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
    public static void tgn(int w, int h){
        for (int i = 0; i <= h; i++) {
            for (int j = i; j <= w; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
    public static void tg(int w,int h){
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
