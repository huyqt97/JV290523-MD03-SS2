import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tính chu vi và diện tích hình chữ nhật .\n" +
                "2.Tính chu vi và diện tích hình tam giác\n" +
                "3.Tính chu vi và diện tích hình tròn.\n" +
                "0.Thoát\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                cn();
                break;
            case 2:
                tg();
                break;
            case 3:
                tron();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }

    public static void cn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hình chữ nhật");
        System.out.println("nhập chiều dài: ");
        int d = sc.nextInt();
        System.out.println("nhập chiều rộng: ");
        int r = sc.nextInt();
        int cv = (d + r) * 2;
        int dt = d * r;
        if (d > 0 && r > 0) {
            System.out.println("chu vi hình CN = " + cv);
            System.out.println("diện tích hình CN = " + dt);
        }
    }

    public static void tg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hình tam giác");
        System.out.println("nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.println("nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.println("nhập cạnh c: ");
        int c = sc.nextInt();
        int cv = a + b + c;
        double s = (a + b + c) / 2.0;
        double dt =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("chu vi hình CN = " + cv);
            System.out.println("diện tích hình CN = " + dt);
        }
    }
    public static void tron() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hình tròn");
        System.out.println("nhập bán kính: ");
        int a = sc.nextInt();
        double cv = Math.PI*Math.pow(a,2);
        double dt = 2*Math.PI*a;
        if (a > 0) {
            System.out.println("chu vi hình CN = " + cv);
            System.out.println("diện tích hình CN = " + dt);
        }
    }
}
